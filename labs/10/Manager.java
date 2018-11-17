package lab10;
interface Printable {
	public void print();
}

class Rectangle implements Printable {
	private int length,width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void print() {
		System.out.println("Rectangle : length : " + length + " width : " + width + " Area : " + length * width);
	}
}

class SportCar implements Printable {
	private String name;
	private long number;

	public SportCar(String name,long number) {
		this.name = name;
		this.number = number;
	}

	public void print() {
		System.out.println("Sports Car : Name : "+name +" Number : "+number);
	}
}

class Manager implements Printable {
	private String name;
	private long deptNumber;

	public Manager(String name,long deptNumber) {
		this.name = name;
		this.deptNumber = deptNumber;
	}
	public void print() {
		System.out.println("Manager : Name :"+name +" Department Number : "+deptNumber);
	}
}
class PrintableDemo {
	public static void main (String [] args) {
		Printable vec[] = {
				new Rectangle(200,100),
				new SportCar("Fiat",7892321),
				new Rectangle(34,32),
				new Manager("Claire",32),
				new Rectangle(54,10),
				new SportCar("Audi",4322344),
				new SportCar("Mazda",4322343),
				new Manager("John",2344322)
		};

		for(int index = 0;index < vec.length;index++)
			vec[index].print();

	}
}

