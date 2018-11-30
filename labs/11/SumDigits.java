package lab11;
import java.util.*;
public class SumDigits {
	static int sum;
	public static int sumDigits(long x) {
		if (x > 0) {
			sum = sum + (int)(x % 10);
			sumDigits(x / 10);
		}
		return sum;
	}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any combination of numbers(no spaces): ");
		int number = input.nextInt();
		System.out.print("Sum of the numbers: " + sumDigits(number));
	}
}


