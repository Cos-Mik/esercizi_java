package miosi.prg.n06.es01;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		this(0.0);
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		setRadius(radius);
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return Math.PI * radius * 2.0;
	}
}