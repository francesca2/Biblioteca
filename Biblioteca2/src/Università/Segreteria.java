package Università;

public class Segreteria {
	//metodi per gestire l'università
	//1. studente registra studente(string nome, string cognome) e genera la matricola
	//2. docente registra docente(string nomee, string cognome, string codicefiscale)
	//3. corso registra corso(string nomecorso, int ore)
	//4. boolean aggiungiStudenteAlCorso(Studente s, Corso c)
	//5. boolean aggiungiDocentiAlCorso(Docente d, Corso c)
	
	public Studente registraStudente(Università u,String nome, String cognome)
	{
		Studente s = u.trovaStudente(nome, cognome);
		
		if(!u.getListaStudenti().contains(s))
		{
			Integer nm=new Integer(u.getListaStudenti().size() + 1);
			String matricola=nm.toString();
			s=new Studente(nome,cognome,matricola);
			if(s.isValid())
			{
			u.aggiungiStudente(s);
			u.getBiblioteca().aggiungiUtente(s);
			}
		}
		
		return s;
	}
	
	public Docente registraDocente(Università u, String nome, String cognome, String codiceFiscale)
	{
		Docente d= u.trovaDocente(nome, cognome, codiceFiscale);
		
		if(!u.getListaDocenti().contains(d) )
		{
			d=new Docente(nome, cognome, codiceFiscale);
			if(d.isValid())
			{
			u.aggiungiDocente(d);
			u.getBiblioteca().aggiungiUtente(d);
			}
		}
		
		return d;
	}
	
	public Corso registraCorso(Università u, String nome, int ore)
	{
		Corso c= u.trovaCorso(nome);
		
		if(!u.getListaCorsi().contains(c))
		{
			c= new Corso(nome, ore);
			if(c.isValid())
			{
			u.aggiungiCorso(c);
			}
		}
		
		return c;
	}
	
	//Metodo per aggiungere uno studente ad un corso
	public boolean aggiungiStudenteAlCorso(Università u,Studente s, Corso c)
	{
		boolean result=false;
		
		if(!c.getListaIscritti().contains(s) && u.getListaStudenti().contains(s))
		{
			c.aggiungiStudente(s);
			result=true;
		}
		
		return result;
	}
	
	//Metodo per aggiungere il docente al corso
	public boolean aggiungiDocenteAlCorso(Università u,Docente d, Corso c)
	{
		boolean result=false;
		
		if(!c.getListaDocenti().contains(d) && u.getListaDocenti().contains(d))
		{
			c.aggiungiDocente(d);
			result=true;
		}
		
		return result;
	}	

}
