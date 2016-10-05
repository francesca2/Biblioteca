package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Utente implements ValidaDati {

	protected String nome;
	protected String cognome;
	protected String codiceFiscale;
	private List<Libro> listaLibriUtente =new ArrayList<Libro>();
	private Map<String,Libro> libriUtente = new TreeMap<String,Libro>();
	private int numeroLibriInPrestito;
	
	//Costruttore
	public Utente() {
	}
	
	public Utente(String nome, String cognome, String codiceFiscale) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale= codiceFiscale;
	}

	//Getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Libro> getListaLibriUtente() {
		return listaLibriUtente;
	}

	public void setListaLibriUtente(List<Libro> listaLibriUtente) {
		this.listaLibriUtente = listaLibriUtente;
	}
		
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public Map<String, Libro> getLibriUtente() {
		return libriUtente;
	}

	public void setLibriUtente(Map<String, Libro> libriUtente) {
		this.libriUtente = libriUtente;
	}
	
	public int getNumeroLibriInPrestito() {
		return numeroLibriInPrestito;
	}

	public void setNumeroLibriInPrestito(int numeroLibriInPrestito) {
		this.numeroLibriInPrestito = numeroLibriInPrestito;
	}

	//Metodo per aggiungere un libro ai prestiti di quell'utente
	public void aggiungiLibroUtente(Libro l)
	{
		//listaLibriUtente.add(l);
		libriUtente.put(l.getSerialNumber(), l);
		this.setNumeroLibriInPrestito(this.getNumeroLibriInPrestito()+1);
	}
	
	//Metodo per togliere il libro restituito alla lista prestiti
	public void restituisciLibro(Libro l)
	{
//		listaLibriUtente.remove(l);
		libriUtente.remove(l.getSerialNumber());
		this.setNumeroLibriInPrestito(this.getNumeroLibriInPrestito()-1);
		
	}
	
	//Metodo per la concatenazione per stampare la lista dei libri in prestito
	public String toStringPrestito()
	{
		String str="\n";
		for(Libro l: listaLibriUtente)
		{
			str=str + l.getAutore() + " " + l.getTitolo() + "\n"; 
		}
		
		return str;
	}

	@Override
	public boolean isValid() {
		boolean result= false;

			if(!this.nome.isEmpty() && this.nome!=null && !this.cognome.isEmpty() && this.cognome!=null)
				{
					result=true;
				}
			
		return result;
	}
	
	public int getSize(Map<String,Utente> M)
	{
		int size= M.size();
		return size;
	}
	
}
