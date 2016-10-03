package Università;

import Biblioteca.*;

public class Studente extends Utente implements ValidaDati {
	//string matricola, double media, nome, cognome

	private String matricola;
	private double media;
	
	//Costruttori
	public Studente() {

	}
	
	public Studente(String nome, String cognome) {
		super(nome,cognome);
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Studente(String nome, String cognome, String matricola) {
		super(nome,cognome);
		this.nome = nome;
		this.cognome = cognome;
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
