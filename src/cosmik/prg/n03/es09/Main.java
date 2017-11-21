package cosmik.prg.n03.es09;

public class Main {
	public static void main(String[] args) {
		/*for (char i = 'a'; i <= 'z'; ++i) {
			System.out.print(i+" ");
		}
		System.out.println();*/

		for (int i = 0x00; i <= 0x10; ++i) {
			for (int j = 0x00; j <= 0x10; ++j) {
				System.out.printf("%3x ",i*j);
			}
			System.out.println();
		}
	}
}