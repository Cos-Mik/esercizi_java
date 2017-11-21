package miosi.prg.n08.es03;

public class ReversedString implements CharSequence {
	private CharSequence str;

	public ReversedString(CharSequence s) {
		str = s;
	}

	public char charAt(int index) {
		return str.charAt(length() - index - 1);
	}

	public int length() {
		return str.length();
	}

	public ReversedString subSequence(int start, int end) {
		return new ReversedString(str.subSequence(length() - end, length() - start));
	}

	public String toString() {
		return new StringBuilder(this).toString();
	}
}