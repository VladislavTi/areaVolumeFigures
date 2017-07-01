package figures;

import interfaceHasSquare.Body;

public class Sphere implements Body{

	
	private double r;
	
	public Sphere(double r) {
		this.r = r;
	}
	
	@Override
	public double volume(double a) {
		// TODO Auto-generated method stub
		
		double v = 4 * Math.PI * a * a * a / 3;
		System.out.println("Volume of sphere with R = " + a +" is " + v);
		return v;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double v = 4 * Math.PI * this.r * this.r * this.r / 3;
		System.out.println("Volume of sphere is " + v);
		return v;
	}

	@Override
	public double surfaceArea() {
		// TODO Auto-generated method stub
		double s = 4 * Math.PI * this.r * this.r;
		System.out.println("Surface area of sphere is " + s);
		return s;
	}

}
