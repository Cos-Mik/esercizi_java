package cosmik.prg.n08.es05;

import miosi.prg.n04.es03.Razionale;

public class ComparableRazionale extends Razionale implements Comparable<Razionale> {
	public ComparableRazionale(int n, int d) {
		super(n,d);
	}

	public int compareTo(Razionale r) {
		// semplifica();
		//r.semplifica();
		int a = getNumeratore();
		int b = getDenominatore();
		int c = getNumeratore();
		int d = getDenominatore();

		if (a*d > b*c) {
			return -1;
		} else if (a*d == b*c) {
			return 0;
		} else {
			return +1;
		}
	}

	public boolean equals(Razionale r) {
		int a = getNumeratore();
		int b = getDenominatore();
		int c = getNumeratore();
		int d = getDenominatore();
		return a*d == b*c;
	}
}