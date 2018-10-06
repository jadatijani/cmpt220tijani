package lab5;
public class lab5_7 {

	public static final int F = 4; 

	public static Boolean UpperTriangular(int matrix [][]) { 
		for (int a = 1; a < F ; a++) 
			for (int b = 0; b < a; b++) 
				if (matrix[a][b] != 0) 
					return false; 
		return true; 
	} 
	public static void main(String [] args) { 
		int[][] matrix = { { 1, 3, 5, 3 }, 
					       { 0, 4, 6, 2 }, 
					       { 0, 0, 2, 5 }, 
					       { 0, 0, 0, 6 } }; 
					
		System.out.println("Matrix is an upper triangular matrix? ");
		if (UpperTriangular(matrix)) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 
} 

