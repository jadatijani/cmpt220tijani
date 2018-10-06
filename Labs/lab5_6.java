package lab5;
import java.util.*;

public class lab5_6 {
	
	public static double[] rowAverage(double[][] row) {
        double average[] = new double[row.length];
        double total[] = new double[row[0].length];
        int sum = 0;
        for (int i = 0; i < row.length; i++){
            for (int j = 0; j < row[0].length; j++){             
                total[i] = sum + row[i][j];
            }
            average[i] = total[i] / row.length;
        }
        return average;
    }
    public static double[] columnAverage(double[][] row) {
        double average[] = new double[row[0].length];
        double total = 0;
        for (int i = 0; i < row[0].length; i++){
            for (int j = 0; j< row.length; j++){             
                total = total + row[i][j];
            }
            average[i] = total / row[0].length;
            System.out.println("The average is: " + average);
        }
        return average;
    }
    public static void main(String [] args) {
    		Scanner input = new Scanner(System.in);
    		System.out.print("Enter a matrix: ");
    }
} 