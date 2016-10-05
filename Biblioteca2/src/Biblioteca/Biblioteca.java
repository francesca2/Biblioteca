package Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Biblioteca {

	private String nomeBiblioteca;
	private List<Libro> listaLibri = new ArrayList<Libro>();
	private List<Utente> listaUtenti = new ArrayList<Utente>();
	private List<Prestito> listaPrestiti = new ArrayList<Prestito>();
	private Map<String,Utente> mappaUtenti = new TreeMap<String,Utente>();
	private Map<String,Libro> mappaLibri = new TreeMap<String,Libro>();
	
	// Costruttori
	public Biblioteca() {

	}

	public Biblioteca(String nomeBiblioteca) {
		super();
		this.nomeBiblioteca = nomeBiblioteca;
	}

	// Getter e setter
	public String getNome() {
		return nomeBiblioteca;
	}

	public void setNome(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}

	public List<Libro> getListaLibri() {
		return listaLibri;
	}

	public void setListaLibri(List<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}

	public List<Utente> getListaUtenti() {
		return listaUtenti;
	}

	public void setListaUtenti(List<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}

	public List<Prestito> getListaPrestiti() {
		return listaPrestiti;
	}

	public void setListaPrestiti(List<Prestito> listaPrestiti) {
		this.listaPrestiti = listaPrestiti;
	}

	public Map<String, Utente> getMappaUtente() {
		return mappaUtenti;
	}

	public void setMappaUtente(Map<String, Utente> mappaUtente) {
		this.mappaUtenti = mappaUtente;
	}

	public Map<String, Libro> getMappaLibri() {
		return mappaLibri;
	}

	public void setMappaLibri(Map<String, Libro> mappaLibri) {
		this.mappaLibri = mappaLibri;
	}

	// Metodo per inserire nuovi libri alla lista libri della biblioteca
	public void aggiungiLibro(Libro l) {
//		listaLibri.add(l);
		mappaLibri.put(l.getSerialNumber(), l);
	}

	// Metodo per inserire nuovi utenti alla lista utenti della biblioteca
	public void aggiungiUtente(Utente u) {
//		listaUtenti.add(u);
		mappaUtenti.put(u.getCodiceFiscale(), u);
	}
	//Metodo per inserire nuovi libri alla lista libri della biblioteca
	public void aggiungiPrestito(Prestito p) {
		listaPrestiti.add(p);
	}

	// Metodo per cercare un libro all'interno della biblioteca ed avere un
	// riferimento ad esso
//	public Libro trovaLibro(String autore, String titolo) {
//		Libro ll = new Libro(autore, titolo);
//
//		for (Libro l : listaLibri) {
//			if (l.getAutore() == autore && l.getTitolo() == titolo) {
//				ll = l;
//			} else {
//				continue;
//			}
//		}
//
//		return ll;
//	}
	

	// Metodo per vedere se un utente è iscritto alla biblioteca ed avere un
	// riferimento ad esso
//	public Utente trovaUtente(String nome, String cognome) {
//		Utente v = new Utente();
//
//		for (Utente u : listaUtenti) {
//			if (u.getNome() == nome && u.getCognome() == cognome) {
//				v = u;
//				break;
//			} else {
//				continue;
//			}
//		}
//
//		return v;
//	}
	
	//Metodo per trovare un prestito
	
	public Prestito trovaPrestito(Utente u)
	{
		Prestito p= new Prestito();
		
		for(Prestito pp : listaPrestiti)
		{
			if(pp.getUtente() == u)
			{
				p=pp;
				break;
			}
			else
			{
				continue;
			}
		}
		return p;
	}

	// Metodi di concatenazione per stampare la lista degli utenti assieme alla
	// lista dei loro libri in prestito
	// e per stampare la lista dei libri e la loro quantità disponibile
	public String toStringUtenti() {
		String str = "";
		for (Utente u : listaUtenti) {
			str = str + u.getNome() + " " + u.getCognome() + " "
					+ u.toStringPrestito() + "\n";
		}
		return str;
	}

	public String toStringLibri() {
		String str = "";
		for (Libro l : listaLibri) {
			str = str + l.getAutore() + " " + l.getTitolo() + " "
					+ l.getCopieDisponibili() + "\n";
		}
		return str;
	}

}
