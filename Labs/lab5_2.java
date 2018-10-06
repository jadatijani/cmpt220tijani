package lab5;
import java.util.*;
public class lab5_2 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] set = new double [10];
		for (int i = 0; i < 10; i++) {
			set[i] = input.nextDouble();
		}
		deviation(set);
		mean(set);
	}
	public static double mean(double[] s) {
		double sum = 0; 
		for(int i = 0; i < 10; i++) {
			sum += s[i];	
		}
		double mean = sum / 10;
		System.out.println("Mean: " + mean);
		return mean;
	}
	public static double deviation(double[] s) {
		double sum = 0;
		for(int j = 0; j < 10; j++) {
			sum += s[j];
		}
		double inside = 0;
		for(int k = 0; k < 10; k++) {
			inside += ((s[k] - mean(s)) * (s[k] - mean(s)));
		}
		double numerator = sum * (inside);
		double deviation = Math.sqrt(numerator / 9); 
		System.out.println("Standard Deviation: ");
		return deviation;
	}
}