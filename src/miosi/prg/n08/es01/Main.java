package miosi.prg.n08.es01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String line = s.nextLine();

		Istogramma isto = new Istogramma(line);

		isto.normalize();
	}
}