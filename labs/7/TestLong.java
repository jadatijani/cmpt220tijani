package lab7;
public class TestLong {
	public static void main(String [] args) {

		MyLong MyLongVar = new MyLong(1357L);
		if(MyLongVar.isEven()) {
			System.out.println(MyLongVar.getValue() + " is Even.");
		}
		if(MyLongVar.isOdd()) {
			System.out.println(MyLongVar.getValue() + " is Odd.");
		}
		if(MyLongVar.isPrime()) {
			System.out.println(MyLongVar.getValue() + " is Prime.");
		}
		long value = 8642L;
		if(MyLong.isEven(value)) {
			System.out.println(value + " is Even.");
		}
		if(MyLong.isOdd(value)) {
			System.out.println(value + " is Odd.");
		}
		if(MyLong.isPrime(value)) {
			System.out.println(value + " is Prime.");
		}
		MyLong MyLongVar2 = new MyLong(981276345L);
		if(MyLong.isEven(MyLongVar2)) {
			System.out.println(MyLongVar2.getValue() + " is Even.");
		}
		if(MyLong.isOdd(MyLongVar2)) {
			System.out.println(MyLongVar2.getValue() + " is Odd.");
		}
		if(MyLong.isPrime(MyLongVar2)) {
			System.out.println(MyLongVar2.getValue() + " is Prime.");
		}
		char ch[] = {'1','2','3','4','5','6','7','8','9','1','2','3'};
		long l1 = MyLong.parseLong(ch);
		System.out.println(l1);
		String str = "23456789876565";
		long l2 = MyLong.parseLong(str);
		System.out.println(l2);
	}
}