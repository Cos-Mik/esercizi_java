package miosi.prg.n03.es03;

public class TestRisultato {
	public static void main(String[] args) {
		Risultato r1 = CambiaRisultato.cambiaRisultato(50.f);

		System.out.println(r1.risultato);
		CambiaRisultato.cambiaRisultato(r1, 20.f);
		System.out.println(r1.risultato);
	}
}