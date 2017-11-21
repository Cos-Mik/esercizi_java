package miosi.prg.n06.es01;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle() {
		this(0.0, 0.0);
	}

	public Rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
	}

	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		setWidth(width);
		setHeight(height);
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2.0 * (width + height);
	}
}