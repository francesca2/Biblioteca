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

		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "t123" ,1));
		System.out.println("Copie totali: "+g.registraLibro(b, "tttt", "aaaa", "t123", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "T123" , 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "TTTT", "AAAA", "T123", 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "NNNN", "aaaa", "N456" , 1));
		System.out.println("Copie totali: "+g.registraLibro(b, "FFFF", "aaaa", "F456" , 1));

		System.out.println("Registrazione Utenti:");

		try {
			if(g.registraUtente(b, "Mario", "Rossi", "MRIRSS46G547S")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			System.out.println(e.getMessage());
		}
		try {
			if(g.registraUtente(b, "Mario", "Rossi", "MRIRSS46G547S")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			System.out.println(e.getMessage());
		}
		try {
			if(g.registraUtente(b, "Chiara", "Verdi", "CHTVRD89P321T")==true){
			System.out.println("Utente Registrato");
			}else{
			System.out.println("Utente gi‡ Registrato");}
		} catch (UtenteGi‡Esiste e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Prestito Libri: ");

		if(g.prestaLibro(b, "t123", "MRIRSS46G547S")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "T123", "MRIRSS46G547S")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		
		if(g.prestaLibro(b, "N456", "MRIRSS46G547S")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "F456", "MRIRSS46G547S")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "N456", "CHTVRD89P321T")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}
		if(g.prestaLibro(b, "F456", "CHTVRD89P321T")==true){
		System.out.println("Libro prestato!");
		}else{
		System.out.println("Impossibile prestare!");}

		System.out.println("Resituzione libri: ");

		if(g.restituzioneLibro(b, "F456", "CHTVRD89P321T")==true){
		System.out.println("Libro restituito!");
		}else{
		System.out.println("Impossibile restituire!");}
		if(g.restituzioneLibro(b, "F456", "CHTVRD89P321T")==true){
		System.out.println("Libro restituito!");
		}else{
		System.out.println("Impossibile restituire!");}
		}

		
}
