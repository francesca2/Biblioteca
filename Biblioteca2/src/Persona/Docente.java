package Persona;

public class Docente extends Persona {
	
	private int stipendio;

	public Docente() {
	}
	
	public Docente(String nome, String cognome, int stipendio) {
		super(nome,cognome);
		this.stipendio = stipendio;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}	
	
	@Override
public String toString()
{
		String str = this.nome + " " + this.cognome + " " + this.stipendio;
		return str;
}
}
