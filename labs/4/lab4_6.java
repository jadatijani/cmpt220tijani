package lab4;

import java.util.ArrayList;

public class lab4_6 {

	public static void main(String[] args) {
		ArrayList intx = new ArrayList(); // JA: You were supposed to use regular arrays
		for (int i = 0; i < 10; i++)
			intx.add((int)(Math.random() * 10 + 1));
		intx.add(-1);
		for (int i = 1; i <= 10; i++)
			addy(intx, i);
		System.out.println(intx);
		addy(3,intx, 10);
		addy(7,intx, 100);
		System.out.println(intx);
	}
	public static void addy(ArrayList array, int insert) {
		array.add(insert);
	}
	public static void addy(int position, ArrayList array, int insert) {
		array.add(position, insert);
	}

}
