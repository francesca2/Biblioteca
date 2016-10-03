import Biblioteca.Biblioteca;
import Biblioteca.Libro;
import Biblioteca.Utente;
import Biblioteca.Gestione;
import Biblioteca.UtenteGi‡Esiste;


public class TestBiblioteca {

	public static void main(String[] args) {
		
		Gestione g=new Gestione();
		
		Biblioteca b1 = new Biblioteca("Calvino");
		Biblioteca b2 = new Biblioteca("Centrale");
		
		g.registraLibro(b1, "aaa", "aaa",3);
		g.registraLibro(b1, "bbb", "bbb",1);
		g.registraLibro(b1, "aaa", "aaa",2);
		g.registraLibro(b1, "ccc", "ccc",5);
		g.registraLibro(b1, "ddd", "ddd",3);
		
		g.registraLibro(b2, "aaa", "aaa",2);
		g.registraLibro(b2, "ccc", "ccc",5);
		g.registraLibro(b2, "ddd", "ddd",3);
		
//		System.out.print(g.registraLibro(b1, "aaa", "aaa",3));
//		System.out.print(b1.toStringLibri());

		try {
			g.registraUtente(b1,"Paolino","Paperino");
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			g.registraUtente(b2,"Paolino","Paperino");
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			g.registraUtente(b1,"Archimede","Pitagorico");
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.prestaLibro(b1, "aaa", "aaa" , "Paolino", "Paperino");
		g.prestaLibro(b1, "bbb", "bbb" , "Paolino", "Paperino");
		g.prestaLibro(b1, "ccc", "ccc" , "Paolino", "Paperino");
		g.prestaLibro(b1, "ddd", "ddd" , "Paolino", "Paperino");
		
//		g.restituzioneLibro(b1, "bbb", "bbb", "Paolino", "Paperino");
		g.prestaLibro(b1, "bbb", "bbb" , "Archimede", "Pitagorico");
		
		System.out.println(b1.toStringUtenti());	
	
		g.prestaLibro(b2, "aaa", "aaa" , "Paolino", "Paperino");
		
		System.out.println("Libri della biblioteca Calvino:" + "\n" + b1.toStringLibri());
		System.out.println("Libri della biblioteca Centrale:" + "\n" + b2.toStringLibri());
		
	}

}
