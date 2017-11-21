package miosi.prg.n06.es03;

import miosi.prg.n06.es02.Point2D;

public class Point3D extends Point2D {
	private double z;

	public Point3D() {
		this(0.0, 0.0, 0.0);
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		setZ(z);
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
	}
}