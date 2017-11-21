package miosi.prg.n06.es01;

public class Square extends Rectangle {
	public Square() {
		this(0.0);
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	public void setWidth(double width) {
		setSide(width);
	}

	public void setHeight(double height) {
		setSide(height);
	}

	public void setSide(double side) {
		super.setWidth(side);
		super.setHeight(side);
	}

	public double getSide() {
		return super.getWidth();
	}
}