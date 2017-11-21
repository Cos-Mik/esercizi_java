package miosi.prg.n04.es01;

public class Auto {
	private String scuderia;
	private Pilota pilota;

	public Auto(String scuderia, Pilota Pilota) {
		this.scuderia = scuderia;
		this.pilota = pilota;
	}

	public String getScuderia() {
		return scuderia;
	}

	public Pilota getPilota() {
		return pilota;
	}

	public String dammiDettagli() {
		return toString();
	}

	public String toString() {
		return scuderia + " di " + pilota.getNome();
	}
}