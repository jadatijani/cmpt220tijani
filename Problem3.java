package Lab2;
import java.util.Scanner;
public class Problem3 {

	public static void main(String [] args) {
	Scanner	input = new Scanner(System.in);
	System.out.print("Enter a lower limit: ");
	int llimit = input.nextInt();
	System.out.print("Enter an upper limit: ");
	int ulimit = input.nextInt();

	System.out.println((int)(Math.random() * ((ulimit - llimit) + 1) + llimit));
	System.out.println((int)(Math.random() * ((ulimit - llimit) + 1) + llimit));
	System.out.println((int)(Math.random() * ((ulimit - llimit) + 1) + llimit));
	
	}

}
