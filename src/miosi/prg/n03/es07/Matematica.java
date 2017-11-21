package miosi.prg.n03.es07;

import java.util.Random;

public class Matematica {
	private static Random random = new Random();

	public static int[] generaVettore(int L) {
		int[] v = new int[L];
		for (int i=0; i<v.length; ++i) {
			v[i] = random.nextInt();
		}
		return v;
	}

	public static int[][] generaMatrice(int R, int C) {
		int[][] m = new int[R][];
		for (int i=0; i<m.length; ++i) {
			m[i] = generaVettore(C);
		}
		return m;
	}

	public static int[] sommaVettori(int[] a, int[] b) {
		if (a.length != b.length) {
			throw new IllegalArgumentException("I vettori devono avere dimensione uguale");
		}
		int[] somma = new int[a.length];
		for (int i=0; i<somma.length; ++i) {
			somma[i] = a[i] + b[i];
		}
		return somma;
	}

	public static int[][] sommaMatrici(int[][] a, int[][] b) {
		if (a.length != b.length) {
			throw new IllegalArgumentException("Le matrici devono avere dimensione uguale");
		}
		int[][] somma = new int[a.length][];
		for (int i=0; i<somma.length; ++i) {
			somma[i] = sommaVettori(a[i], b[i]);
		}
		return somma;
	}

	public static void stampaVettore(int[] v) {
		System.out.print("| ");
		for (int n : v) {
			System.out.print(n + " ");
		}
		System.out.println("|");
	}

	public static void stampaMatrice(int[][] m) {
		for (int[] v : m) {
			stampaVettore(v);
		}
	}
}