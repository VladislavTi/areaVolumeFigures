package figures;


import interfaceHasSquare.HasSquare;

public class Triangle implements HasSquare{

	private double a, b, c, ha, p;
	
	public Triangle(double a, double h) {
		this.a = a;
		this.ha = h;
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		findHeight(this.a, this.b, this.c);
	}
	
	private double halfPerimetr (double a, double b, double c) {
		double p = a + b + c;
		p /= 2;
		this.p = p;
		return p;
	}
	
	private double findHeight (double a, double b, double c) {
		halfPerimetr(a, b, c);
		double h = 2*Math.sqrt(this.p*(this.p-a)*(this.p-b)*(this.p-c))/a;
		this.ha = h;
		return h;
	}

	@Override
	public double square() {
		// TODO Auto-generated method stub
		
		double s = this.ha * a;
		s /= 2;
		System.out.println("Square of triangle = " + s);
		return s;
	}




}
