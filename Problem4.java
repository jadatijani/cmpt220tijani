package Lab1;
import java.util.Scanner;
public class Problem4 {

	public static void main(String [] args) {
	Scanner	input = new Scanner(System.in);
	System.out.print("Enter a value for the mass(kilograms): ");
	
	double mass = input.nextDouble();
	double speed = 299972458;
	double energy = mass * speed * speed; 
	
	System.out.println("Energy = " + energy);

	}

}
