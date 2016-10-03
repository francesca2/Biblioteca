package Biblioteca;

public class Libro implements ValidaDati {
	
	private String autore;
	private String titolo;
	private String serialNumber;
	private int copieTotali;
	private int copieDisponibili;
	
	//Costruttori
	public Libro() {

	}
	
	public Libro(String autore, String titolo,String serialNumber) {
		super();
		this.autore = autore;
		this.titolo = titolo;
		this.serialNumber=serialNumber;
		this.copieTotali=0;
		this.copieDisponibili=0;
	}

	//Getter e setter
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getCopieTotali() {
		return copieTotali;
	}

	public void setCopieTotali(int copieTotali) {
		this.copieTotali = copieTotali;
	}

	public int getCopieDisponibili() {
		return copieDisponibili;
	}

	public void setCopieDisponibili(int copieDisponibili) {
		this.copieDisponibili = copieDisponibili;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public boolean isValid() {

		boolean result=false;
		if(!this.autore.isEmpty() && this.autore!=null && !this.titolo.isEmpty() && this.titolo!=null)
			{
				result=true;
			}
			
			return result;
	}
	
	

}
