package lab11;
import java.util.*;
public class RecursiveSpecialCharacters {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-Please enter a series of characters: ");
		
		String str = input.nextLine();
		char [] array = str.toCharArray();
		System.out.print("-Please enter a character to calculate number of occurences: ");
		
		String str1 = input.next();
		char ch = str1.charAt(0);
		int occurences = count(array,ch);
		System.out.println("-Number of occurences of specified character: " + occurences);
	}
	public static int count(char[] chars, char ch) {
		return count (chars, ch, chars.length - 1);
	}
	public static int count (char[]chars, char ch, int high) {
		if (high >= 0) {
			int count = 0;
			char ch1 = chars[high];
			if(Character.toUpperCase(ch) == Character.toUpperCase(ch1))
				count++;
			return count + count(chars, ch, high - 1);
		}
		else
			return 0;

	}
}
