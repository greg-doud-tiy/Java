package ssa;

public class Triangle extends Shape {
	int height;
	int length;
	
	public String print() {
		return null;
	}
	public int getArea() {
		return this.height * this.length / 2;
	}
	
	public Triangle(int length, int height) {
		this.length = length;
		this.height = height;
	}

}
