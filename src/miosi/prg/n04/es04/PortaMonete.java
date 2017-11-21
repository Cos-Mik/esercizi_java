package miosi.prg.n04.es04;

public class PortaMonete {
	private Moneta[] monete;

	private int numeroMonete;

	private static final int DIMENSIONE_PORTAMONETE = 10;

	public PortaMonete(Moneta[] m) {
		monete = new Moneta[DIMENSIONE_PORTAMONETE];
		numeroMonete = 0;
		for (int i=0; i<monete.length && i<m.length; ++i) {
			monete[i] = m[i];
			++numeroMonete;
		}
	}

	public void aggiungi(Moneta m) {
		if (numeroMonete < monete.length) {
			monete[numeroMonete] = m;
			++numeroMonete;
		}
	}

	public Moneta preleva() {
		if (numeroMonete > 0) {
			--numeroMonete;
			return monete[numeroMonete];
		}
		return null;
	}

	public void stato() {
		for (int i=0; i<numeroMonete; ++i) {
			System.out.println(monete[i].getDescrizione());
		}
	}
}