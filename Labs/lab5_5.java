package lab5;
import java.util.*;
public class lab5_5 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Enter # of rows and columns: ");
		
		int rows = input.nextInt();
		int columns = input.nextInt();
		int array[][] = new int[rows][columns];
		System.out.println("Enter matrix:");
	 	
		for(a = 0; a < rows; a++) {
	   	    for(b = 0; b < columns; b++) {
	        	array[a][b] = input.nextInt();
	            }
	  	}
		System.out.println("Matrix before transpose: ");
	  	
		for(a = 0; a < rows; a++) {
	      	    for(b = 0; b < columns; b++) {
	          	System.out.print(array[a][b] + " ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("Matrix after transpose: ");
	  	
	 	for(a = 0; a < columns; a++) {
	      	    for(b = 0; b < rows; b++) {
	                System.out.print(array[b][a] + " ");
	            }
	            System.out.println(" ");
	        }
	    }
	}