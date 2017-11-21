package cosmik.prg.n02.es01;

public class Macchina {
	public static final int PRESSIONE_MINIMA = 65;
	private Ruota[] ruote;

	private float kmPercorsi;

	public Macchina() {
		ruote = new Ruota[4];
		for (int i = 0; i < 4; ++i) {
			ruote[i] = new Ruota();
		}

		kmPercorsi = 0;
	}
	public void cammina(float km){
		kmPercorsi += km;

		for (Ruota r : ruote) {
			r.setPressione(r.getPressione()-r.getCoefficiente()*km);
		}
	}

	public void monitora(){
		System.out.println("La macchina ha percorso "+kmPercorsi+" km!");
		for (Ruota r : ruote) {
			System.out.println("  La pressione delle ruota e': "+r.getPressione());
		}
		System.out.println();
	}

	public void revisione() {
		for (Ruota r : ruote) {
			if (r.getPressione() <= PRESSIONE_MINIMA) {
				r.gonfia();
			}
		}
	}
}