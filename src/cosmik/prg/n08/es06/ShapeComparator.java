package cosmik.prg.n08.es06;

import miosi.prg.n06.es01.Shape;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {
	public int compare(Shape a, Shape b) {
		if (a.getArea() > b.getArea()) {
			return 1;
		} else if (a.getArea() == b.getArea()) {
			return 0;
		} else {
			return -1;
		}
	}
}
/*
template<typename T> struct less {
	bool operator () (T a, T b) {
		return a < b;
	}
};


[](a,b){a<b}*/