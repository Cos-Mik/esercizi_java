package miosi.prg.n07.es01;

public class Bicicletta extends Veicolo {
	private String modello;

	public Bicicletta() {
		this("");
	}

	public Bicicletta(String modello) {
		setModello(modello);
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getModello() {
		return modello;
	}
}