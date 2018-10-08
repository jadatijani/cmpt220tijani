package lab5;
import java.util.*;
// JA: You should add some comments decribing the logic
public class AnotherBrickWall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double h = input.nextDouble();
		int w = input.nextInt(), bricks = input.nextInt();
		int[] brickCount = new int[bricks];
		
		for (int i = 0; i < bricks; i++) {
	            brickCount[i] = input.nextInt();
	            }
		int width = w;
		for (int i = 0; i < brickCount.length; i++) {
			width -= brickCount[i];
			
			if(width == 0) {
				width = w;
				h--;
				if(h == 0) {
					System.out.println("YES");
					return;
					}
				}
			else if(width < 0) {
				System.out.println("NO");
				return;
				}
			}
		}
	}

