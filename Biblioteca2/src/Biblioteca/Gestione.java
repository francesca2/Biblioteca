package Biblioteca;

import java.util.Date;

public class Gestione {

	//Tempo limite per la restituzione 10 giorni
	private static final int tempoLimite = 36000000;
	
	//Metodo per la registrazione di uno o più libri in una biblioteca, verifica se il libro è
	//già presente in biblioteca, se sì aggiorna le copie altrimenti lo inserisce nella lista
	public Libro registraLibro(Biblioteca b, String autore, String titolo, String serialNumber, int copie)
	{		
		Libro l=b.trovaLibro(serialNumber);
		
		if(l==null)
		{	
			l= new Libro(autore,titolo,serialNumber);
			b.aggiungiLibro(l);
			l.setCopieTotali(copie);
			l.setCopieDisponibili(copie);
		}
		else
		{
			l.setCopieTotali(l.getCopieTotali() + copie);
			l.setCopieDisponibili(l.getCopieDisponibili()+copie);
		}	
		return l;
		}
	
	//Metodo per registrare un utente in una biblioteca: verifica se l'utente è già registrato, nel caso
	//in cui lo sia lancia un'eccezione ed avverte che è già registrato, altrimenti lo aggiunge alla lista
	//di utenti iscritti alla biblioteca
	public boolean registraUtente(Biblioteca b,String nome, String cognome, String codiceFiscale) throws UtenteGiàEsiste
	{
		boolean result=true;
		
			if(b.getMappaUtente().containsKey(codiceFiscale))
			{
				result=false;
				throw new UtenteGiàEsiste("L'utente è già registrato");
			}

				Utente u= new Utente(nome,cognome, codiceFiscale);
				b.aggiungiUtente(u);
		
		return result;
	}
	
//Metodo per prendere in prestito i libri: controlla che il libro richiesto sia registrato nella bibliotea,
	//che vi siano copie disponibili, che l'utente sia registrato alla Biblioteca, che non abbia già tre libri in prestito
	// e che non abbia prestiti scaduti, se passa tutti questi controlli crea un nuovo prestito, lo aggiunge
	//alla lista prestiti della biblioteca, alla lista prestiti dell'utente e aggiorna le copie disponibili altrimenti ritorna false
	public boolean prestaLibro(Biblioteca b, String serialNumber, String codiceFiscale)
	{
		boolean result=true;
		Libro l=b.trovaLibro(serialNumber);
		Utente u=b.trovaUtente(codiceFiscale);
		Prestito p=b.trovaPrestito(u);
		Date dataOggi= new Date();
	
			if(b.getMappaLibri().containsKey(l.getSerialNumber()) && l.getCopieDisponibili()>0)
			{
				//L'idea è che essendo la lista ordinata, mi basta controllare il prestito più vecchio, 
				//ovvero il primo che incontro quando faccio cercaPrestito. Se anche quello più recente
				//fosse scaduto tanto non potrei comunque imprestare il libro.
					if(b.getMappaUtente().containsKey(u.getCodiceFiscale()) && u.getLibriUtente().size()<3 && (dataOggi.getTime()-p.getDate().getTime())<=tempoLimite)
					{
						u.aggiungiLibroUtente(l);
						l.setCopieDisponibili(l.getCopieDisponibili() - 1);
						Prestito pp=new Prestito(l,u,dataOggi);
						b.aggiungiPrestito(pp);
					}
					else
					{
						result= false;
					}
			}
			else
			{
				result=false;
			}
		
		return result;
	}
	
	//Metodo per restituire un libro: controlla che il libro e l'utente siano registrati alla biblioteca, se sì
	//toglie il libro dalla lista prestiti e aggiorna il numero di copie disponibili di quel libro.
	public boolean restituzioneLibro(Biblioteca b, String serialNumber, String codiceFiscale){
		boolean result=true;
		Libro l=b.trovaLibro(serialNumber);
		Utente u=b.trovaUtente(codiceFiscale);

			if(b.getListaLibri().contains(l))
			{
					if(b.getListaUtenti().contains(u) && u.getListaLibriUtente().contains(l))
					{
						u.restituisciLibro(l);
//						b.aggiungiLibro(b.trovaLibro(autore,titolo));
						l.setCopieDisponibili(l.getCopieDisponibili()+1);
					}
					else
					{
						result=false;
					}
			}
			else
			{
				result=false;
			}
		
		return result;
	}
	

	
}
