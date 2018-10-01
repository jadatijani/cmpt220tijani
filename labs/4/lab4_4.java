package lab4;
import java.util.Scanner;
public class lab4_4 {

	static final int maximumCharacters = 256;
		  
	    static void characterCount(String s) {  
	       int count[] = new int [maximumCharacters]; 
	       int length = s.length(); 
	       for (int i = 0; i < length; i++) 
	    	   count[s.charAt(i)]++; 
	       
	       char ch[] = new char[s.length()]; 
	       for (int i = 0; i < length; i++) { 
	    	   ch[i] = s.charAt(i); 
	    	   int find = 0; 
	    	   for (int j = 0; j <= i; j++) { 
	    		   if (s.charAt(i) == ch[j])  
	    			   find++;
	    		   } 
	    	   if (find == 1)
	    		   System.out.println("Number of Letter " + s.charAt(i) + " is: " + count[s.charAt(i)]);             
	    	   } 
	       } 
	    public static void main(String [] args){ 
	        Scanner input = new Scanner(System.in); 
	        System.out.println("Enter a string: ");
	        String s = input.nextLine();
	        s = s.replaceAll("\\s","");
	        characterCount(s);
	    } 
	} 

