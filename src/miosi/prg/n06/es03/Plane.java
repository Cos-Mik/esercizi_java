package miosi.prg.n06.es03;

public class Plane {
	private Point3D pt1, pt2, pt3;

	private static final double EPS = 1E-5;

	public Plane(Point3D pt1, Point3D pt2, Point3D pt3) {
		this.pt1 = new Point3D(pt1.getX(), pt1.getY(), pt1.getZ());
		this.pt2 = new Point3D(pt2.getX(), pt2.getY(), pt2.getZ());
		this.pt3 = new Point3D(pt3.getX(), pt3.getY(), pt3.getZ());
	}

	public boolean contains(Point3D pt) {
		double a = (pt2.getY() - pt1.getY()) * (pt3.getZ() - pt1.getZ()) - (pt3.getY() - pt1.getY()) * (pt2.getZ() - pt1.getZ());
		double b = (pt3.getX() - pt1.getX()) * (pt2.getZ() * pt1.getZ()) - (pt2.getX() - pt1.getX()) * (pt3.getZ() - pt1.getZ());
		double c = (pt2.getX() - pt1.getX()) * (pt3.getY() - pt1.getY()) - (pt3.getX() - pt1.getX()) * (pt2.getY() - pt1.getY());
		double d = -(a * pt1.getX() + b * pt1.getX() + c * pt1.getZ());

		double diff = a * pt.getX() + b * pt.getY() + c * pt.getZ() + d;
		return diff > -EPS && diff < EPS;	
	}
}