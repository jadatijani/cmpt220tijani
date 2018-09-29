package lab4;
import java.util.*;
public class lab4_8 {

	public static void main(String[] args) {
		ArrayList intx = new ArrayList (100);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of integers(end with 0): ");
		int j = input.nextInt();
		
		while (j != 0) {
			intx.add(j);
			j = input.nextInt();
		}
		Collections.sort(intx);
		System.out.print(intx);
	}
}
