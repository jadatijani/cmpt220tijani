package lab8;
public class TestAccount {
	public static void main(String [] args) {
		Account account1 = new Account(1001, 10000, 2.9);
		Account account2 = new SavingsAccount();
		Account account3 = new CheckingsAccount();
		
		account1.deposit(5000);
		account1.withdraw(4500);
		
		System.out.println("-Account ID: " + account1.getID());
		System.out.println("-Balance: " + account1.getBalance());
		System.out.println("-Monthly interest rate: " + account1.getMonthlyInterestRate());
		System.out.println("-Date created: " + account1.getDate());
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		System.out.println(account3.toString());
	}

}
