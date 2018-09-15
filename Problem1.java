package Lab2;
import java.util.Scanner;
public class Problem1 {

	public static void main(String [] args) { 
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter value for number1: ");    
		int number1 = input.nextInt();
		System.out.print("Enter a value for number2: ");
		int number2 = input.nextInt();
		
	    System.out.println(number1 + " is LESS THAN " + number2 +"? " + (number1 < number2));
	    System.out.println(number1 + " is LESS THAN OR EQUAL TO " + number2 +"? " + (number1 <= number2));
	    System.out.println(number1 + " is EQUAL TO " + number2 +"? " + (number1 == number2));
	    System.out.println(number1 + " is NOT EQUAL TO " + number2 +"? " + (number1 != number2));
	    System.out.println(number1 + " is GREATER THAN " + number2 +"? " + (number1 > number2));
	    System.out.println(number1 + " is GREATER THAN OR EQUAL TO " + number2 +"? " + (number1 >= number2));
	}
}
