package miosi.prg.n06.es01;

public abstract class Shape {
	private String color;
	private boolean filled;

	public Shape() {
		setColor("white");
		setFilled(false);
	}

	public Shape(String color, boolean filled) {
		setColor(color);
		setFilled(filled);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public boolean getFilled() {
		return filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}