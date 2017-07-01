package figures;

import interfaceHasSquare.Body;

public class Cube implements Body{

	private double a;
	
	public Cube(double a) {
		this.a = a;
	}
	
	@Override
	public double volume(double a) {
		// TODO Auto-generated method stub
		double v = a*a*a;
		System.out.println("Volume of cube with side " + a +" is " + v);
		return v;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		double si = 6 * this.a * this.a;
		System.out.println("Surface area of cube is " + si);
		return si;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		
		double v = this.a * this.a * this.a;
		System.out.println("Volume of cube is " + v);
		return v;
	}

}
