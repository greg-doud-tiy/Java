package ssa;

public class Square extends Shape {

	int length;
	
	public String print() { 
		return null; 
	}
	public int getArea() {
		return this.length * this.length;
	}
	
	public Square(int length) {
		this.length = length;
	}

}
