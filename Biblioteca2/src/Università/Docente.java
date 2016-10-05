package Università;

import java.util.ArrayList;
import java.util.List;

import Biblioteca.*;

public class Docente extends Utente implements ValidaDati {	
	//string codice fiscale, nome, cognome, materia che insegna

	private String codiceFiscale;
	private List<Corso> ListaCorsiDocente = new ArrayList<Corso>();
	
	//Costruttore
	public Docente() {
		super();
	}
	
	public Docente(String nome, String cognome, String codiceFiscale) {
		super(nome,cognome,codiceFiscale);
		this.codiceFiscale = codiceFiscale;
	}

	//Getters e setters
	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public List<Corso> getListaCorsiDocente() {
		return ListaCorsiDocente;
	}

	public void setListaCorsiDocente(List<Corso> listaCorsiDocente) {
		ListaCorsiDocente = listaCorsiDocente;
	}
	
	
	
}
