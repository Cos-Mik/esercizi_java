package miosi.prg.n07.es01;

public class VeicoloAMotore extends Veicolo {
	private int cilindrata;

	public VeicoloAMotore() {
		this(0);
	}

	public VeicoloAMotore(int cilindrata) {
		setCilindrata(cilindrata);
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}
}