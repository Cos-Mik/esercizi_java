package miosi.prg.n02.es04;

public class Main {
	public static void main(String[] args) {
		Moneta coin = new Moneta();
		int contaCroce = 0;
		for (int i=0; i<5; ++i) {
			Moneta.Stato s = coin.lancia();
			System.out.println(s);
			if (s == Moneta.Stato.CROCE) {
				++contaCroce;
			}
		}
		System.out.println("Croce è uscito " + contaCroce + " volte");
	}
}