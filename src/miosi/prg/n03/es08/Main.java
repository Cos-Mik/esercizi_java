package miosi.prg.n03.es08;

public class Main {
	public static void main(String[] args) {
		int i=0;
		int n=0;
		while (true) {
			if (i%2 == 0) {
				System.out.println(i);
				++n;
			}
			if (n >= 5) {
				break;
			}
			++i;
		}
	}
}