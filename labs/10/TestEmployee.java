package lab10;
public class TestEmployee {
	public static void main(String [] args) {
		Employee vec[] = {
				new Manager1("John", 52, 104),
				new Clerk("Daniel", 26, 110),
				new Manager1("Steve", 42, 120),
				new Manager1("Stacey", 34, 120)};
		double hours[] = {140, 150, 130, 180};
		double total = 0;
		for (int index = 0; index < vec.length; index++){
			total += vec[index].salary(hours[index]);
			System.out.println(vec[index]);
		}
		System.out.println("The total payment of the employees is "
				+ total);
	}
}

	
