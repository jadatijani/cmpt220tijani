package lab3;
public class lab3_7 {

	public static void main(String [] args) {
		final int numbersperline = 10;
		int count = 1;
		
		for(int n = 1; n <= 50; n++){
			System.out.printf("%-7d",getPentagonalNumber(n));
			
			if(count % numbersperline == 0) 
				System.out.println();
			count++;
			}
		}
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1))/2;
		}
	}


