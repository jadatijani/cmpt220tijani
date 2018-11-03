package lab8;
import java.util.*;
public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		double s1, s2, s3;
		String color;
		boolean fill;
		
		System.out.println("-Enter a color: ");
		color = input.nextLine();
		
		System.out.println("-Enter three sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("-Fill triangle? (True/False): ");
		fill = input.nextBoolean();
		
			Triangle triangle = new Triangle(s1,s2,s3);
			
			triangle.putcolor(color);
			triangle.setFill(fill);
	
		System.out.println("-Sides of " + triangle.toString());
		System.out.println("-Area of the Triangle " + triangle.getarea());
		System.out.println("-Perimeter of the Triangle " + triangle.getperimeter());
		System.out.println("-The triangle color is: " + triangle.getcolor());
		System.out.println("-Is the triangle filled: " + triangle.isFilled());
	}
	
	public Triangle (double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getside1() {
		return side1;
	}
	
	public double getside2() {
		return side2;
	}
	
	public double getside3() {
		return side3;
	}
	
	public double getarea() {
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);
		return area;
	}
	
	public double getperimeter() {
		return (side1 + side2 + side3); 
	}
	
	public String toString() { 
		return "Triangle: side1 = " + side1 + "," + " side2 = " + side2 + "," + " side3 = " + side3;
	}

}
