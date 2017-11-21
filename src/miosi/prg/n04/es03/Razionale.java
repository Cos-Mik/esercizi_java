package miosi.prg.n04.es03;

public class Razionale {
	private int numeratore;
	private int denominatore;

	public Razionale(int numeratore, int denominatore) {
		setNumeratore(numeratore);
		setDenominatore(denominatore);
	}

	public int getNumeratore() {
		return numeratore;
	}

	public void setNumeratore(int numeratore) {
		this.numeratore = numeratore;
	}

	public int getDenominatore() {
		return denominatore;
	}

	public void setDenominatore(int denominatore) {
		if (denominatore == 0) {
			throw new IllegalArgumentException("Il denominatore non puo' essere 0");
		}
		this.denominatore = denominatore;
	}

	public void stampa() {
		System.out.println(this);
	}

	public String toString() {
		return numeratore + " / " + denominatore;
	}

	public void semplifica() {
		// TODO trovare algoritmo per semplificare
	}

	public Razionale somma(Razionale num) {
		int mcd = getDenominatore() * num.getDenominatore();
		Razionale s = new Razionale(getNumeratore() * num.getDenominatore() + num.getNumeratore() * getDenominatore(), mcd);
		s.semplifica();
		return s;
	}

	public static Razionale somma(Razionale a, Razionale b) {
		return a.somma(b);
	}

	public Razionale sottrai(Razionale num) {
		Razionale neg = new Razionale(-num.getNumeratore(), num.getDenominatore());
		return somma(neg);
	}

	public static Razionale sottrai(Razionale a, Razionale b) {
		return a.sottrai(b);
	}

	public Razionale moltiplica(Razionale num) {
		return new Razionale(getNumeratore() * num.getNumeratore(), getDenominatore() * num.getDenominatore());
	}

	public static Razionale moltiplica(Razionale a, Razionale b) {
		return a.moltiplica(b);
	}

	public Razionale dividi(Razionale num) {
		Razionale inv = new Razionale(num.getDenominatore(), num.getNumeratore());
		return moltiplica(inv);
	}

	public static Razionale dividi(Razionale a, Razionale b) {
		return a.dividi(b);
	}
}