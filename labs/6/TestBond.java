package lab6;
import java.util.*;
public class TestBond {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);	
		double coupon;
		int payments;
		double interest;
		double valueMaturity;
		
		System.out.print("Enter the coupon payment: $ ");
		coupon = input.nextDouble();
		System.out.print("Enter number of payments: ");
		payments = input.nextInt();
		System.out.print("Enter the interest rate (%): ");
		interest = input.nextDouble();
		System.out.print("Enter the value of maturity: ");
		valueMaturity = input.nextDouble();
		
		Bond b = new Bond(coupon, payments, interest, valueMaturity);
		System.out.printf("Price of the Bond: $%.2f\n", b.getPrice());
	}
}