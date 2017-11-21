package cosmik.prg.n02.es01;

import java.util.Random;

public class Ruota {
	private float pressione;
	private float coefficiente;

	private static Random rand = new Random();
	
	private static final float PRESSIONE_MIN = 0;
	private static final float PRESSIONE_MAX = 100;

	
	public Ruota(){
		setPressione(rand.nextFloat()*(PRESSIONE_MAX - PRESSIONE_MIN) + PRESSIONE_MIN);
		coefficiente = rand.nextFloat();
	}

	public Ruota(float pressione) {
		setPressione(pressione);
	}

	public void setPressione(float pressione) {
		if (pressione < PRESSIONE_MIN) {
			this.pressione = PRESSIONE_MIN;
		} else if (pressione > PRESSIONE_MAX) {
			this.pressione = PRESSIONE_MAX;
		} else {
			this.pressione = pressione;
		}
	}

	public float getPressione () {
		return pressione;
	}

	public float getCoefficiente(){
		return coefficiente;
	}

	public void gonfia() {
		setPressione(PRESSIONE_MAX);
	}
}