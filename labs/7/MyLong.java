package lab7;
public class MyLong {
	
	private long value;
	MyLong() {
	}
	
	public MyLong(long value) {
		this.value = value;
	}
	
	public long getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		if (value % 2 == 0)
			return false;
		else
			return true;
	}
	
	public boolean isPrime() {
		if (value == 1)
			return false;
		for (int i = 2; i * i <= value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(long value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(long value) {
		if (value % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(long value) {
		return isPrime (value);
	}
	
	public static boolean isEven(MyLong MyLongVar) {
		return MyLong.isEven (MyLongVar.getValue());
	}
	
	public static boolean isOdd(MyLong MyLongVar) {
		return MyLong.isOdd (MyLongVar.getValue());
	}
	
	public static boolean isPrime(MyLong MyLongVar) {
		return MyLong.isPrime (MyLongVar.getValue());
	}
	
	public static long parseLong(char ch[]) {
		String str = "";
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		return Long.parseLong(str);
	}
	
	public static long parseLong(String str) {
		return Long.parseLong(str);
	}
}
