package lab5;
import java.util.*;
public class lab5_3 {

	   public static void main(String [] args) { 
	      Scanner input = new Scanner(System.in);           
	      int scores[] = new int[5];
	      int best;
	    
	      while(true) {
	         System.out.println("Enter the number of students: ");
	         int students = input.nextInt();
	         if(students <= 0) //Enter 0 if there are no more grades to be entered; program will terminate                               
	         {
	            System.out.println("Program Terminated\n");
	            break;
	         }
	         else
	         {
	         //User will need to input the students' grades 
	            System.out.println("Enter " + students + " scores in ascending order (1-100):");
	         //Initiate loop for reading grades 
	            for(int i = 0; i < students; i++)                   
	            {
	               scores[i] = input.nextInt();
	            }
	         //Assume first array element is best
	            best = scores[0];                   
	         //Loop to compare first element with other elements in array to find best
	            for (int c = 1; c < students; c++)     
	            {
	               if (scores[c] > best)          
	               {
	                  best = scores[c];                   
	               }
	            }
	         //Initiate loop to show letter grade for each input 
	            for(int i = 0; i < students; i++)               
	            {
	               //Print corresponding grades and letter grades 
	               if(scores[i] >= best - 10)           
	                  System.out.println("The student's " + "score is " + scores[i] + ", and the letter grade is " + " A \n");
	               else if(scores[i] >= best - 20)
	                  System.out.println("The student's " + "score is " + scores[i] + ", and the letter grade is " + " B \n");
	               else if(scores[i] >= best - 30) 
	                  System.out.println("The student's " + "score is " + scores[i] + ", and the letter grade is " + " C \n");
	               else if(scores[i] >= best - 10)
	                  System.out.println("The student's " + "score is " + scores[i] + ", and the letter grade is " + " D \n");
	               else
	                  System.out.println("The student's " + "score is " + scores[i] + ", and the letter grade is " + " F \n");
	            }
	         }
	      }
	      input.close();
	   }
	}