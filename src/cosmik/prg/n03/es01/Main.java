package cosmik.prg.n03.es01;

public class Main {
	public static void main(String[] args) {
		Persona[] persone = {
			new Persona("Mario","Rossi",88),
			new Persona("Luigi","Verdi",25),
			new Persona("Wario","Gialli",36)
		};

		for ( Persona p : persone ) {
			System.out.println(p);
		}

	}
}