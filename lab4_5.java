package lab4;

public class lab4_5 {

	public static void main(String[] args) {
		double[] numbers = new double [1000];
		int lowerThan = 0;
		int higherThan = 0;
		int sum = 0;
		double average;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = (double) (Math.random() * 1000);
			sum += numbers [i];
		}
	average = (double) (sum/numbers.length);
	for (int i = 0; i < numbers.length; i++) {
		if (numbers [i] > average) {
			higherThan++;
		}
		else if (numbers [i] < average) {
			lowerThan++;
		}
	}
	System.out.println("Average: " + average);
	System.out.println("Numbers higher than the average: " + higherThan);
	System.out.println("Numbers lower than the average: " + lowerThan);
	}

}
