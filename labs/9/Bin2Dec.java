package lab9;
import java.util.*;
public class Bin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String binaryString;

		System.out.println("Enter Binary string: ");
		binaryString = input.nextLine();

		System.out.println("Binary String: " + binaryString);
		Bin2Dec(binaryString);      
	}
	
	private static void Bin2Dec(String binaryString) {
		int decimal = 0;
		try {
			for (int i = 0; i < binaryString.length(); i++) {
				int n = Integer.parseInt(String.valueOf(binaryString.charAt(i)));
				if(n != 0 && n != 1)
					throw new NumberFormatException();
				decimal += n * Math.pow(2.0, i);  
			}  
			System.out.println("Decimal value: " + decimal);
		}
		catch (NumberFormatException e) {
			System.out.println("Exception: Number Format Exception");
		}      
	}
}