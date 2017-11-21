package miosi.prg.n04.es04;

import java.util.Random;

public class TestMonete {
	public static void main(String[] args) {
		Random r = new Random();

		Moneta m1 = new Moneta(20);
		Moneta m2 = new Moneta(100);
		Moneta m3 = new Moneta(1);

		System.out.println(m1.getDescrizione());
		System.out.println(m2.getDescrizione());
		System.out.println(m3.getDescrizione());

		Moneta[] pm1_arr = new Moneta[8];
		for(int i=0; i<pm1_arr.length; ++i) {
			pm1_arr[i] = new Moneta(r.nextInt(200));
		}
		PortaMonete pm1 = new PortaMonete(pm1_arr);

		Moneta[] pm2_arr = new Moneta[11];
		for(int i=0; i<pm2_arr.length; ++i) {
			pm2_arr[i] = new Moneta(r.nextInt(200));
		}
		PortaMonete pm2 = new PortaMonete(pm2_arr);

		pm1.stato();
		pm2.stato();
	}
}