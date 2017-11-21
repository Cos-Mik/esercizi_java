package miosi.prg.n07.es01;

public class Automobile extends VeicoloAMotore {
	private String targa;

	public Automobile() {
		this("");
	}

	public Automobile(String targa) {
		setTarga(targa);
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTarga() {
		return targa;
	}
}