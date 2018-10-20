package lab6;

public class Square {
	private double width;
	
	public Square() {
		width = 1;
	}
	
	public Square(double squareWidth) {
		width = squareWidth;
	}
	
	public double getArea() {
		return width * width;
	}
	
	public double getPerimeter() { 
		return (4 * width);
	}

	public static void main(String [] args) {
		Square square1 = new Square(40);
		System.out.println("The area of a square with a width of 40 is: " + square1.getArea());
		System.out.println("The perimeter of a square with a width of 40 is: " + square1.getPerimeter());
		Square square2 = new Square(39.5);
		System.out.println("The area of a square with a width of 39.5 is: " + square2.getArea());
		System.out.println("The perimeter of a square with a width of 39.5 is: " + square2.getPerimeter());
	}
}