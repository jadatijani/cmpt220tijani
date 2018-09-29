package lab4;
import java.util.Scanner;
public class lab4_2 {
	
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in); 

		char[][] table = new char [5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				int number = (int) (Math.random() * 26 + 97);
				table [i][j] = (char) number;
				System.out.print(table[i][j] + " ");
			}
			System.out.println(); 
		}
	}
}

