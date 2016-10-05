package Università;

import Biblioteca.*;

public class Studente extends Utente implements ValidaDati {
	//string matricola, double media, nome, cognome

	private String matricola;
	private double media;
	
	//Costruttori
	public Studente() {

	}
	
	public Studente(String nome, String cognome, String codiceFiscale) {
		super(nome,cognome,codiceFiscale);
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	
	public Studente(String nome, String cognome,String codiceFiscale, String matricola) {
		super(nome,cognome,codiceFiscale);
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.matricola = matricola;
	}
	
	//Getters e setters
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	
}
