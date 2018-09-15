package Lab2;
import java.util.Scanner;
public class Problem5 {

	public static void main(String [] args) {
		Scanner Scanner = new Scanner(System.in);  
		
		System.out.println("Enter a first string: ");
		String str1 = Scanner.nextLine();
		System.out.println("Enter a second string: ");
		String str2 = Scanner.nextLine();
		
		if (str1.compareTo(str2) == -1) {
			System.out.println(str1);
			System.out.println(str2);
		}
		else if (str1.compareTo(str2) == 1) {
			System.out.println(str2);
			System.out.println(str1);
		}
		else {
			System.out.println(str1);
			System.out.println(str2);	
		}
		
	}

}
