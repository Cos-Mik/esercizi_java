package cosmik.prg.n02.es06;

public class Main {
	public static void main(String[] args) {
		int a = 5, b = 3;
		float r1 = (float)a/(float)b;

		char c = 'a';
		short s = 5000;

		int r2 = c * s;

		int i = 6;
		float f = 3.14F;

		float r3 = i + f;

		float r4 = r1 - r2 - r3;

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}