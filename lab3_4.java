package lab3;

public class lab3_4 {
	public static void main(String[] args) {
		
		System.out.println("Biggest Prime Number below 15000: ");
		boolean isPrime = false;
		for(int i = 15000; i > 1; i--) {
			for(int k = i - 1; k > 0; k--) {
				if(k == 2 && i / 2 != 0) {
					System.out.print(i);
					isPrime=true;
					break;
				}
				if(i % k == 0) {
					break;
				}
			}
			if(isPrime == true) {
				break;
			}
			
		}
	} 
}
