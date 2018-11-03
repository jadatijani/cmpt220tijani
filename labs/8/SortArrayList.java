package lab8;
import java.util.*;
public class SortArrayList {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Please enter 5 numbers: ");
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int a = 0; a < 5; a++) list.add(input.nextInt());
		sort(list);
		
		System.out.println("Numbers in increasing order:");
		System.out.println(list);
	}
	public static void sort(ArrayList<Integer> list) {
		for (int a = 0; a < list.size() - 1; a++) {
			int min = list.get(a);
			int value = a;
			for (int b = a + 1; b < list.size(); b++) {
				if (min > list.get(b)) {
					min = list.get(b);
					value = b;
				}
			}
			if (value != a) {
				list.set(value, list.get(a));
				list.set(a, min);
			}
		}
	}
}

