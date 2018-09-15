package Lab2;
import java.util.Scanner;
public class Problem4 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first character: ");
	    char c1 = scanner.next().charAt(0);
		System.out.print("Enter second character: ");
	    char c2 = scanner.next().charAt(0);
		
	    int number1 = Character.valueOf(c1);
	    int number2 = Character.valueOf(c2);
	    
	    System.out.println("Result is: " + (c1 + c2));
		
	}
	

}
