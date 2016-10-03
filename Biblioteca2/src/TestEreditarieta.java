import Persona.*;

public class TestEreditarieta {

	public static void main(String[] args) {

		Persona s1 =new Studente("Paolino", "Paperino",25.3);
		Persona d1= new Docente("Archimede","Pitagorico", 1000);
		
		System.out.println(s1.toString());
		System.out.println(d1.toString());
		System.out.println(getDati(s1));
		
	}
	
	public static String getDati(Persona p)
	{
		return p.toString();
	}
}

