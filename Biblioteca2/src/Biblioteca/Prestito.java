package Biblioteca;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestito {
	
	private Libro libro;
	private Utente utente;
	private Date date;

	//Costruttori
	public Prestito() {
	}
	
	public Prestito(Libro libro, Utente utente, Date date) {
		this.libro = libro;
		this.utente = utente;
		this.date = date;
	}

	public Prestito(Libro libro, Utente utente, String date) throws ParseException {
		this.libro = libro;
		this.utente = utente;
		this.date = DataUtility.convertStringToDate(date);
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
