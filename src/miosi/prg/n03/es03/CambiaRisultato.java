package miosi.prg.n03.es03;

public class CambiaRisultato {
	public static Risultato cambiaRisultato(Risultato r, float f) {
		r.risultato += f;
		return r;
	}

	public static Risultato cambiaRisultato(float f) {
		return new Risultato(f);
	}
}