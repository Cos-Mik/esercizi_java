package miosi.prg.n03.es01;

public class Main {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Mario", "Rossi", 27);
		Persona persona2 = new Persona("Luigi", "Verdi", 24);

		Persona persona3 = persona1;

		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
	}
}