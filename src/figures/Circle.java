package figures;

import interfaceHasSquare.HasSquare;

public class Circle implements HasSquare{

	private double r, d;
	
	
	public Circle (double d) {
		this.d = d;
		this.r = d / 2;
	}
	
	
	@Override
	public double square() {
		// TODO Auto-generated method stub
		double s = Math.PI * this.r * this.r;
		System.out.println("Square of circle = " + s);
		return s;
	}

	
	
}
