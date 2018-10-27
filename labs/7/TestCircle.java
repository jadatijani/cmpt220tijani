package lab7;
public class TestCircle {
	public static void main(String [] args) {
		Circle circ1 = new Circle (2, 2, 5.5);
		
		System.out.println("Area of Circle1: " + circ1.getArea());
		System.out.println("Perimeter of circle1: " + circ1.getPerimeter());
		System.out.println("Circle1 contains point (3,3): " + circ1.contains(3,3));
		System.out.println("Circle1 contains circle centered at (4,5) and radius 10.5: " + circ1.contains(new Circle(4, 5, 10.5)));
		System.out.println("Circle1 overlaps circle centered at (3,5) and radius 2.3: " + circ1.overlaps(new Circle(3, 5, 2.3)));
	}
}
		