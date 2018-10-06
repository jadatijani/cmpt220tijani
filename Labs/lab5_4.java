package lab5;
import java.util.*;
public class lab5_4 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter array size: ");
		
		int number = input.nextInt();
		System.out.println("Enter numbers " + "(" + number + ")" + " for first array: ");
		
		int[] arr1 = new int [number];
		for(int i = 0; i < number; i++)
			arr1[i] = input.nextInt();
		System.out.println("Enter numbers " + "(" + number + ")" + " for second array: ");
		int[] arr2 = new int [number];
		for(int i = 0; i < number; i++)
			arr2[i] = input.nextInt();
		
		System.out.println("Arrays are equal? " + equal(arr1, arr2));
	}
	public static boolean equal(int[] x, int[] y) {
		Arrays.sort(x);
		Arrays.sort(y);
		for(int i = 0; i < x.length; i++) {
			if (i == x.length - 1 && x[i] == y[i])
				return true;
			if(x[i] != y[i])
				break;
		}	
		return false;
	}
}

