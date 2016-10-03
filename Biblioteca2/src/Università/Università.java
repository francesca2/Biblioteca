package Università;

import java.util.ArrayList;
import java.util.List;

import Biblioteca.*;

public class Università {
	//nome università, list di studenti, docenti, corsi

	private String nomeUniversita;
	private List<Studente> listaStudenti = new ArrayList<Studente>();
	private List<Docente> listaDocenti = new ArrayList<Docente>();
	private List<Corso> listaCorsi = new ArrayList<Corso>();
	//Attributi per utilizzare i metodi e gli attributi di Biblioteca e gestione
	private Biblioteca b= new Biblioteca();
	private Gestione g= new Gestione();
	
	//Costruttori
	public Università() {
		super();
	}

	public Università(String nomeUniversita) {
		this.nomeUniversita = nomeUniversita;
	}

	//Getters e setter
	public String getNomeUniverista() {
		return nomeUniversita;
	}

	public void setNomeUniverista(String nomeUniversita) {
		this.nomeUniversita = nomeUniversita;
	}

	public List<Studente> getListaStudenti() {
		return listaStudenti;
	}

	public void setListaStudenti(List<Studente> listaStudenti) {
		this.listaStudenti = listaStudenti;
	}

	public List<Docente> getListaDocenti() {
		return listaDocenti;
	}

	public void setListaDocenti(List<Docente> listaDocenti) {
		this.listaDocenti = listaDocenti;
	}

	public List<Corso> getListaCorsi() {
		return listaCorsi;
	}

	public void setListaCorsi(List<Corso> listaCorsi) {
		this.listaCorsi = listaCorsi;
	}
	
	public Biblioteca getBiblioteca() {
		return b;
	}
	
	public Gestione getG() {
		return g;
	}

	// Metodo per inserire nuovi studenti alla lista studenti iscritti
	public void aggiungiStudente(Studente s) {
		listaStudenti.add(s);
	}

	// Metodo per inserire nuovi docenti alla lista docenti
	public void aggiungiDocente(Docente d) {
		listaDocenti.add(d);
	}
	
	//Metodo per inserire un corso alla lista corsi
	public void aggiungiCorso(Corso c) {
		listaCorsi.add(c);
	}
	
	//Metodo per cercare uno studente
	public Studente trovaStudente(String nome, String cognome)
	{
		Studente st= new Studente();
		
		for(Studente s: listaStudenti)
		{
			if(nome.equals(s.getNome()) && cognome==s.getCognome())
			{
				st=s;
				break;
			}
			else
			{
				continue;
			}
		}
		
		return st;
	}
	
	//Metodo per cercare un docente
	public Docente trovaDocente(String nome, String cognome, String codiceFiscale)
	{
		Docente dd= new Docente();
		
		for(Docente d: listaDocenti)
		{
			if(nome.equals(d.getNome()) && cognome.equals(d.getCognome()) && codiceFiscale.equals(d.getCodiceFiscale()))
			{
				dd=d;
				break;
			}
			else
			{
				continue;
			}
		}
		
		return dd;
	}
	
	//Metodo per cercare un corso
	public Corso trovaCorso(String nome)
	{
		Corso cc= new Corso();
		
		for(Corso c: listaCorsi)
		{
			if(nome.equals(c.getNomeCorso()))
			{
				cc=c;
				break;
			}
			else
			{
				continue;
			}
		}
		
		return cc;
	}
	
	//Metodo per la concatenazione della lista studenti
	public String toStringStudenti()
	{
		String str="";
		for(Studente s: listaStudenti)
		{
			str=str+ s.getNome() + " " + s.getCognome() + " " + s.getMatricola() + "\n";
		}
		
		return str;
	}
	
}
