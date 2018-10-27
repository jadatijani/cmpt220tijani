package lab7;

public class Circle {
	double x, y;
	double radius;
	final double PI = 3.14;
	
	Circle() {
		x = 0;
		y = 0;
		radius = 1;
	}
	
	Circle(double x,double y, double r){
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {
		return PI * radius * radius;
	}
	double getPerimeter() {
		return 2.0 * PI * radius;
	}
	
	boolean contains(double x, double y) {
		double other = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
		if(other < radius * radius) 
			return true;
		else 
			return false;
	}
	
	boolean contains(Circle circle) {
		double other = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
		if(other < radius * radius) 
			return true;
		else 
			return false;
	}
	
	boolean overlaps(Circle circle) {
		double other = (circle.x - x) * (circle.x - x) + (circle.y - y) * (circle.y - y);
		if(other <= radius + circle.radius && other >= Math.abs(radius - circle.radius)) 
			return true;
		else 
			return false;
	}
}

