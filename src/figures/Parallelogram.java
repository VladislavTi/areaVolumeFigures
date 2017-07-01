package figures;

import interfaceHasSquare.HasSquare;

public class Parallelogram implements HasSquare{

	private double a, h;
	
	public Parallelogram(double a, double h) {
		this.a = a;
		this.h = h;
	}
	
	@Override
	public double square() {
		// TODO Auto-generated method stub

		double s = this.a * this.h;
		System.out.println("Square of parallelogramm = " + s);
		return s;
	}

	
	
}
