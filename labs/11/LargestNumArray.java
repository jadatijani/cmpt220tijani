package lab11;
import java.util.*;
public class LargestNumArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 8 numbers: ");
		int [] userarray = new int[8];
		for (int i = 0; i < 8; i++) {
			userarray[i] = input.nextInt();
		}
		max(userarray);
	}
	
	public static int max(int [] array) {
		int max = array[0];
		for (int i = 1; i < 8; i++) {
			if (array[i] > max)
				max = array[i];
			}
		System.out.println("Largest Number in Array: " + max);
		return max; 
	}
}


