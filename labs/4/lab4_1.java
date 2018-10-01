package lab4;

public class lab4_1 {

	public static void main(String[] args) {
		int centimeters = 1;
		System.out.println("in    cm | cm    in");
		System.out.println("--------------------");
		for (int a = 1; a <= 50; a++) {
			//System.out.print("" + a + "   ");
			System.out.printf("%2d%10.2f |%3d%10.2f\n",a , a * 2.54 , centimeters, centimeters/2.54); // JA
			//System.out.print(" | " + centimeters + "   \n");
			centimeters += 5;
		}
	}

}
