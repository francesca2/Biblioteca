package Università;
import java.util.ArrayList;
import java.util.List;

import Biblioteca.*;

public class Corso implements ValidaDati {

	//nome, int ore
	private String nomeCorso;
	private int oreCorso;
	private List<Studente> listaIscritti = new ArrayList<Studente>();
	private List<Docente> listaDocenti = new ArrayList<Docente>();
	
	public Corso() {
	}

	public Corso(String nomeCorso, int oreCorso) {
		super();
		this.nomeCorso = nomeCorso;
		this.oreCorso = oreCorso;
	}

	
	
	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getOreCorso() {
		return oreCorso;
	}

	public void setOreCorso(int oreCorso) {
		this.oreCorso = oreCorso;
	}
	
	public List<Studente> getListaIscritti() {
		return listaIscritti;
	}

	public void setListaIscritti(List<Studente> listaIscritti) {
		this.listaIscritti = listaIscritti;
	}

	public List<Docente> getListaDocenti() {
		return listaDocenti;
	}

	public void setListaDocenti(List<Docente> listaDocenti) {
		this.listaDocenti = listaDocenti;
	}
	
	// Metodo per inserire nuovi studenti alla lista studenti iscritti
	public void aggiungiStudente(Studente s) {
		listaIscritti.add(s);
	}

	// Metodo per inserire nuovi docenti alla lista docenti
	public void aggiungiDocente(Docente d) {
		listaDocenti.add(d);
	}
	
	@Override
	public boolean isValid() {
		
		boolean result=false;
		if(!nomeCorso.isEmpty() && nomeCorso!=null)
		{
			result= true;
		}
		
		return result;
	}	

}
