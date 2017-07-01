package main;

import figures.Circle;
import figures.Cube;
import figures.Parallelogram;
import figures.Sphere;
import figures.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Triangle tr = new Triangle (3.0, 4.0, 5.0);
		tr.square();

		Circle cir = new Circle (12);
		cir.square();
		
		Parallelogram par = new Parallelogram (12, 5);
		par.square();
		
		Cube cube = new Cube (10);
		cube.surfaceArea();
		cube.volume();
		
		Sphere sph = new Sphere (10);
		sph.surfaceArea();
		sph.volume();
	}

}
