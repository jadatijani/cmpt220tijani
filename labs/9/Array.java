package lab9;
import java.util.*;
public class Array {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int numbers = 100, i;
		Random r = new Random();
		int [] a = new int[numbers];
		for(i = 0; i < numbers; i++)
			a[i] = r.nextInt();
		System.out.println("ARRAY");
		for(i = 0; i < numbers;i++) {
			System.out.print(a[i] + ", ");
			if((i + 1) % 10 == 0)
				System.out.println();
		}
		System.out.println();
		for(; ;) { 
			System.out.print("Enter the value for the array element you wish to see: ");
			i = input.nextInt();
			if(i < 0 || i >= numbers)
				System.out.println("Index Out of Bounds.");
			else
				System.out.println(a[i]);
		}
	}
}

