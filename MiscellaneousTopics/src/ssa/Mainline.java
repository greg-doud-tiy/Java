package ssa;

import java.util.ArrayList;

public class Mainline {

	void exceptionsExample() {
		try {
			// generate a zero divide exception
			int i = 0;
			i = 1/i;
			// generate an index exception
			int[] intArray = new int[5];
			int n = intArray[5];
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic exception: " + ex.toString());
		} catch (Exception ex) {
			System.out.println("General exception: " + ex.toString());
		} finally {
			System.out.println("Finally, do this always.");
		}
	}
	void shapesExample() {
		Square square = new Square(4);
		Triangle triangle = new Triangle(4, 5);
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(square);
		shapes.add(triangle);
		
		for(Shape shape : shapes) {
			System.out.println("Area is " + shape.getArea());
		}
	}
	public static void main(String[] args) {
		Mainline pgm = new Mainline();
		pgm.exceptionsExample();
		pgm.shapesExample();
	}

}
