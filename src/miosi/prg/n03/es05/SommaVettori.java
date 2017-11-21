package miosi.prg.n03.es05;

import miosi.prg.n03.es07.Matematica;

public class SommaVettori {
	public static void main(String[] args) {
		int[] v1 = Matematica.generaVettore(3);
		int[] v2 = Matematica.generaVettore(3);
		int[] v3 = Matematica.sommaVettori(v1, v2);

		Matematica.stampaVettore(v1);
		Matematica.stampaVettore(v2);
		Matematica.stampaVettore(v3);
	}
}