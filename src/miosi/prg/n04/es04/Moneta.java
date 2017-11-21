package miosi.prg.n04.es04;

public class Moneta {
	private static final String DEFAULT_VALUTA = "EURO";

	private int valore; // valore della moneta in centesimi
	private String valuta;

	public Moneta(int valore) {
		this.valore = valore;
		this.valuta = DEFAULT_VALUTA;
	}

	public Moneta(int valore, String valuta) {
		this.valore = valore;
		this.valuta = valuta;
	}

	public int getValore() {
		return valore;
	}

	public String getValuta() {
		return valuta;
	}

	public String getDescrizione() {
		return toString();
	}

	public String toString() {
		return "moneta da " + valore + " centesimi di " + valuta;
	}
}