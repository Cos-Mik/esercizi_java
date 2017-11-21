package cosmik.prg.n02.es01;

public class Main {
	public static void main(String[] args) {
		Macchina m = new Macchina();
		m.monitora();
		for (int i = 0 ; i < 25 ; ++i) {
			m.cammina(40);
			m.revisione();
			m.monitora();
		}
	}
}