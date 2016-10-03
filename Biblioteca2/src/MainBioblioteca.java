import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import Biblioteca.Biblioteca;
import Biblioteca.Gestione;
import Biblioteca.UtenteGi‡Esiste;

public class MainBioblioteca {
	
		public static void main(String[] args) {

		Gestione g = new Gestione();
		Biblioteca b = new Biblioteca("biblio");
		Integer a= new Integer(3);

		System.out.println("Registrazione Libri:");

		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "NNNN", "aaaa", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "FFFF", "aaaa", 1));

		System.out.println("Registrazione Utenti:");

		try {
			if(g.registraUtente(b, "Mario", "Rossi")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			if(g.registraUtente(b, "Mario", "Rossi")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		try {
			if(g.registraUtente(b, "Chiara", "Verdi")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("Prestito Libri: ");

		if(g.prestaLibro(b, "tttt", "aaaa", "Mario", "Rossi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "TTTT", "AAAA", "Mario", "Rossi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		
		if(g.prestaLibro(b, "NNNN", "aaaa", "Mario", "Rossi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "FFFF", "aaaa", "Mario", "Rossi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "NNNN", "aaaa", "Chiara", "Verdi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}

		System.out.println("Resituzione libri: ");

		if(g.restituzioneLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		System.out.println("Libro restituito!");
		}else{
		System.out.println("Impossibile restituire!");}
		if(g.restituzioneLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
		System.out.println("Libro restituito!");
		}else{
		System.out.println("Impossibile restituire!");}
		}

		
}
