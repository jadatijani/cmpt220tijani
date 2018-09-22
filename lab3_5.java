package lab3;
import java.util.Scanner;

public class lab3_5 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		char answer; {
			
			System.out.println("Enter three numbers: ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			double z = input.nextDouble();
			System.out.println("You entered: " + x + " " + y + " " + z);
			System.out.println("Average value: " + average(x, y, z));
			answer = input.next().charAt(0); 
			}
		}
public static double average (double x, double y, double z) { 
	return (double)(x + y + z) / 3.0; 
	}
}
