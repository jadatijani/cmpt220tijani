package lab11;
import java.util.*;
import java.io.*;
public class CountingCharacters {
	static int n = 0;
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("-Type a string: ");
		String str = input.nextLine();
		System.out.print("-Type a character to check quantity of: ");
		String temp = input.nextLine();
		char c = temp.charAt(0);
			int count = count(str,c, 0);
			System.out.println("-There are " + count + " " + c + "'s.");	
	}
	public static int count (String str, char a, int high) {
		if(str.equals("")) {
			return 0;
		} 
		if (high + 1 <= str.length()) {
			if (str.substring(high, high + 1).equals(Character.toString(a))) {
				n++;
			}
			count (str.substring(high + 1, str.length()), a, high);
		}
		return n;
	}
}

