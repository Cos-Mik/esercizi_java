package miosi.prg.n05.es01;

public class Complex {
	private double real_part;
	private double imaginary_part;

	public Complex() {
		real_part = 0.0;
		imaginary_part = 0.0;
	}

	public Complex(double real_part, double imaginary_part) {
		this.real_part = real_part;
		this.imaginary_part = imaginary_part;
	}

	public double getReal() {
		return real_part;
	}

	public void setReal(double real_part) {
		this.real_part = real_part;
	}

	public double getImaginary() {
		return imaginary_part;
	}

	public void setImaginary(double imaginary_part) {
		this.imaginary_part = imaginary_part;
	}

	public Complex sum(Complex num) {
		// (a + ib) + (c + id) = (a + c) + i(b + d)
		return new Complex(getReal() + num.getReal(), getImaginary() + num.getImaginary());
	}

	public static Complex sum(Complex a, Complex b) {
		return a.sum(b);
	}

	public Complex multiply(Complex num) {
		// (a + ib) (c + id) = (ac + iad + ibc - bd) = (ac - bd) + i(ad + bc)
		return new Complex(getReal() * num.getReal() - getImaginary() * num.getImaginary(), getReal() * num.getImaginary() + getImaginary() * num.getReal());
	}

	public static Complex multiply(Complex a, Complex b) {
		return a.multiply(b);
	}

	public String toString() {
		return getReal() + " + i " + getImaginary();
	}
}