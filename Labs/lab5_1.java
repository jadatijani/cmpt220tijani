package lab5;
import java.util.*;
public class lab5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double arrayLength = 10.0;
		double [] myarray = new double[10];
		for (int i = 0; i < 10; i++) {
			myarray[i] = input.nextDouble();
		}
		max(myarray);
	}
	
	public static double max(double[] array) {
		double max = array[0];
		for (int i = 1; i < 10; i++) {
			if (array[i] > max)
				max = array[i];
			}
		System.out.println("Maximum Element in Array: " + max);
		return max; 
	}
}
