package miosi.prg.n02.es02;

public class Quadrato {
	public int lato;

	public final int NUMERO_LATI = 4;

	public Quadrato(int lato) {
		this.lato = lato;
	}

	public int perimetro() {
		return NUMERO_LATI * lato;
	}

	public int area() {
		return lato * lato;
	}
}