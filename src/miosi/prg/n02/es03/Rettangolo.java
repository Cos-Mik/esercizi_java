package miosi.prg.n02.es03;

public class Rettangolo {
	public int base, altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int perimetro() {
		return 2 * (base + altezza);
	}

	public int area() {
		return base * altezza;
	}
}