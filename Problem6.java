package Lab2;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println("Random Phone Number: ");
		
		int number1 = (int)(Math.random() * (800) + 200);
		int number2 = (int)(Math.random() * (800) + 200);
		int number3 = (int)(Math.random() * (10000));
		
		System.out.println("(" + number1 + ")" + number2 + "-" + number3);
	} 

}
