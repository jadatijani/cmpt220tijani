package lab3;

import java.util.Scanner;
public class lab3_6 {
  public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.print("# of vowels in string: " + vowelCount (str));
    }
 public static int vowelCount (String str)
    {
        int count = 0;
        for (int x = 0; x < str.length(); x++)
        {
            if (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i'
                    || str.charAt(x) == 'o' || str.charAt(x) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
		
	
