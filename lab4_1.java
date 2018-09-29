package lab4;

public class lab4_1 {

	public static void main(String[] args) {
		int centimeters = 1;
		System.out.println("in    cm | cm    in");
		System.out.println("--------------------");
		for (int a = 1; a <= 50; a++) {
			System.out.print("" + a + "   ");
			System.out.printf("%.2f" , a * 2.54 , "%.2f" , centimeters/2.54);
			System.out.print(" | " + centimeters + "   ");
			centimeters += 5;
		}
	}

}
