package miosi.prg.n07.es01;

public class Main {
	public static void main(String[] args) {
		Veicolo[] veicoli = new Veicolo[] {
			new Bicicletta(),
			new Automobile(),
			new Ciclomotore()
		};

		double t = 1.0;

		for(Veicolo v : veicoli) {
			v.muovi(t);
		}
	}
}