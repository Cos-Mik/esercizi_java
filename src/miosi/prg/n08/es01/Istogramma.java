package miosi.prg.n08.es01;

public class Istogramma implements Comparable<Istogramma> {
	private static final int ARRAY_SIZE = 'z' - 'a' + 1;

	private float[] chars;

	private boolean normalized = false;

	public Istogramma() {
	}

	public Istogramma(String str)  {
		calculate(str);
	}

	public void calculate(String str) {
		normalized = false;

		chars = new float[ARRAY_SIZE];

		str = str.toLowerCase();

		for (char c : str.toCharArray()) {
			if (c>='a' && c<='z') {
				++chars[c - 'a'];
			}
		}
	}

	public void normalize() {
		if (normalized) {
			return;
		}

		float sum = 0;
		for (int i=0; i<chars.length; ++i) {
			sum += chars[i];
		}

		for (int i=0; i<chars.length; ++i) {
			chars[i] /= sum;
		}

		normalized = true;
	}

	public int compareTo(Istogramma isto) {
		isto.normalize();

		float s = 0;
		for (int i=0; i<chars.length; ++i) {
			s += chars[i] < isto.chars[i] ? chars[i] : isto.chars[i];
		}

		if (s == 0.5) return 0;
		else if (s < 0.5) return -1;
		else return 1;
	}

	public static int compare(Istogramma a, Istogramma b) {
		return a.compareTo(b);
	}

	public String toString() {
		return null;
	}
}