package Persona;

public class Studente extends Persona {
	
	private double media;

	public Studente() {
	}
	
	public Studente(String nome, String cognome, double media) {
		super(nome, cognome);
		this.media = media;
	}
	
//	public String getNomeStudente()
//	{
//		return this.nome;
//	}
//	
//	public String getCognomeStudente()
//	{
//		return this.cognome;
//	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	@Override
	public String toString()
	{
		String str = this.nome + " " + this.cognome + " " + this.media;
		return str;
	}
	
}
