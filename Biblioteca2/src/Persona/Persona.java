package Persona;

public class Persona {
	
	protected String nome;
	protected String cognome;
	
	//Costruttori
	public Persona() {
	}
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	//getter e setter
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
	
	public String toString()
	{
		String str= this.nome + " " + this.cognome;
		return str;
	}
	

}
