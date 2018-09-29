package lab4;
import java.util.*;
public class lab4_7 {

	public static void main(String[] args) {
		ArrayList intx = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list of array integers(end with -1): ");
		int j1 = input.nextInt();
		
		while (j1 != -1) {
			intx.add(j1);
			j1 = input.nextInt();
			}
		for (int i = 0; i < intx.size(); i++) {
			for (int z = i + 1; z < intx.size(); z++) {
				if (intx.get(i) == intx.get(z)); {
				}
			}
		}
		System.out.print(intx);
	}

}
