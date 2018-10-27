package lab7;
import java.util.*;
public class StackOfIntegers {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int elements;
		System.out.print("Enter the positive integer : ");
		elements = input.nextInt();
		Stack <Integer> theStack = new Stack<>();
		int checker = 2;

		while(elements != 1){
			while(elements % checker == 0){
				theStack.push(checker);
				elements = elements / checker;
			}
			checker++;
		}

		System.out.print("The smallest factors are : ");
		while(!theStack.isEmpty()){
			System.out.print(theStack.pop()+" ");
		}
	}
}
