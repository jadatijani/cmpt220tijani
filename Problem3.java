package Lab1;
import java.util.Scanner;
public class Problem3 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		
		double kilograms = ounces * 28.3495;
		System.out.println(ounces + " ounces is " + kilograms + " kilograms ");
	}
}
