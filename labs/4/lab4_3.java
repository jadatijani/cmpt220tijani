package lab4;
import java.util.Scanner;
public class lab4_3 {
	
	public static void main(String [] args) {
	      Scanner input = new Scanner(System.in);
	         System.out.println("Enter a string: ");
	         String s = input.next();
	         s = s.replaceAll("\\s", "");      
      	 System.out.println("String is palindrome? " + isPalindrome(s));
	}

	public static String reverse(String s) {
		String z = "";
		for (int i = s.length()-1; i >= 0; i--) {
			z = z + s.charAt(i);
		}
		return z;
	}
		
	public static boolean isPalindrome (String s) {
		String s4 = reverse (s);
		return (s.equals(s4));
	}
}

	 
	