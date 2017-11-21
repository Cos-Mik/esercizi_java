package miosi.prg.n02.es04;

import java.util.Random;

public class Moneta {
	private Random rand = new Random();

	public enum Stato {
		TESTA, CROCE, LATO
	}

	public Stato lancia() {
		double n = rand.nextDouble();

		if (n < 0.5d) {
			return Stato.TESTA;
		} else {
			return Stato.CROCE;
		}
	}
}