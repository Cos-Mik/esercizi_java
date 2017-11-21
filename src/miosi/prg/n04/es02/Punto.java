package miosi.prg.n04.es02;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public static double distance(Punto a, Punto b) {
		double dx = b.getX() - a.getX();
		double dy = b.getY() - a.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}

	public static Punto middlePoint(Punto a, Punto b) {
		return new Punto((a.getX() + b.getY()) / 2.0, (a.getY() + b.getY()) / 2.0);
	}
}