package miosi.prg.n06.es02;

public class Line {
	private Point2D pt1, pt2;

	private static final double EPS = 1E-5;

	public Line(Point2D pt1, Point2D pt2) {
		this.pt1 = new Point2D(pt1.getX(), pt1.getY());
		this.pt2 = new Point2D(pt2.getX(), pt2.getY());
	}

	public Line(double a, double b, double c) {
		// ax + by + c = 0
		// y = mx + q
		// y = -a/b x - c/b

		//double m = -a/b;
		//double q = -c/b;

		this(-a/b, -c/b);
	}

	public Line(double m, double q) {
		pt1 = new Point2D(0.0, q);
		pt2 = new Point2D(1.0, q + m);
	}

	public boolean contains(Point2D pt) {
		double a = ((pt.getY() - pt1.getY()) / (pt2.getY() - pt1.getY()));
		double b = ((pt.getX() - pt1.getX()) / (pt2.getX() - pt1.getX()));
		double diff = a-b;
		return diff > -EPS && diff < EPS;
	}
}