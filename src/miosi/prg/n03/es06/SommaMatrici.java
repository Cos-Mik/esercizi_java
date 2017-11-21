package miosi.prg.n03.es06;

import miosi.prg.n03.es07.Matematica;

public class SommaMatrici {
	public static void main(String[] args) {
		int[][] m1 = Matematica.generaMatrice(3, 5);
		int[][] m2 = Matematica.generaMatrice(3, 5);
		int[][] m3 = Matematica.sommaMatrici(m1, m2);

		Matematica.stampaMatrice(m1);
		Matematica.stampaMatrice(m2);
		Matematica.stampaMatrice(m3);
	}
}