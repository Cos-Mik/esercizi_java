package miosi.prg.n08.es03;

public class Main {
	public static void main(String[] args) {
		String s = "Questo è solo unsesempio";
		ReversedString rs = new ReversedString(s);
		System.out.println(rs.subSequence(0, 7));
	}
}