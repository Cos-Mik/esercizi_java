package miosi.prg.n07.es01;

public class Ciclomotore extends VeicoloAMotore {
	private long telatio;

	public Ciclomotore() {
		this(0);
	}

	public Ciclomotore(long telatio) {
		setNumTelaio(telatio);
	}

	public void setNumTelaio(long telatio) {
		this.telatio = telatio;
	}

	public long getTelaio() {
		return telatio;
	}
}