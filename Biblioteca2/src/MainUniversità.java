import Università.*;

public class MainUniversità {

	public static void main(String[] args) {
		
		Segreteria s= new Segreteria();
		Università u= new Università("Torino");
		
		Studente s1 =s.registraStudente(u, "Mario", "Rossi");
		Studente s2 = s.registraStudente(u,"Paolo","Bianchi");
		Studente s3 = s.registraStudente(u, "Chiara", "Verdi");
		
		Docente d1= s.registraDocente(u, "Isac", "Newton", "ISCNWT23M321S");
		Docente d2= s.registraDocente(u, "Max", "Plank", "MAXPLN42D634C");
		
		Corso c1 = s.registraCorso(u, "Meccanica razionale", 32);
		Corso c2= s.registraCorso(u, "Meccanica quantistica", 64);
		
		if(s.aggiungiDocenteAlCorso(u, d1, c1)){
			System.out.println("Docente " + d1.getNome() + " " + d1.getCognome() + " registrato al corso di " + c1.getNomeCorso());
		}
		else{
			System.out.println("Impossibile registrare il docente " + d1.getNome() + " " + d1.getCognome() + "al corso!");
		}
		if(s.aggiungiStudenteAlCorso(u, s1, c1)){
			System.out.println("Studente " + s1.getNome() + " " + s1.getCognome() + " registrato al corso di " + c1.getNomeCorso());
		}
		else{
			System.out.println("Impossibile registrare lo studente " + d1.getNome() + " " + d1.getCognome() + "al corso!");
		}
		if(s.aggiungiStudenteAlCorso(u, s1, c1)){
			System.out.println("Studente " + s1.getNome() + " " + s1.getCognome() + " registrato al corso di " + c1.getNomeCorso());
		}
		else{
			System.out.println("Impossibile registrare lo studente " + s1.getNome() + " " + s1.getCognome() + "al corso!");
		}
		if(s.aggiungiStudenteAlCorso(u, s2, c1)){
			System.out.println("Studente " + s2.getNome() + " " + s2.getCognome() + " registrato al corso di " + c1.getNomeCorso());
		}
		else{
			System.out.println("Impossibile registrare lo studente " + s2.getNome() + " " + s2.getCognome() + "al corso!");
		}
		
		u.getG().registraLibro(u.getBiblioteca(), "G. Martin", "Il trono di spade", "GM987" ,2);
		
		u.getG().prestaLibro(u.getBiblioteca(), "GM987", "Mario", "Rossi");
	
		System.out.println(u.toStringStudenti());
//		System.out.println(u.getBiblioteca().toStringUtenti());
		
	}

}
