package cosmik.prg.n08.es06;

import miosi.prg.n06.es01.*;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = {
			new Circle(4.0),
			new Rectangle(20.0, 5.0),
			new Square(15.0),
			new Circle(12.0)
		};

		for (Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + " area " + s.getArea());
		}

		Arrays.sort(shapes, new ShapeComparator());

		System.out.println();

		for (Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + " area " + s.getArea());
		}
	}
}