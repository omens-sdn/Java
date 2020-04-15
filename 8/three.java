import java.util.Scanner;
public class three {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511 : ");
		int x = input.nextInt();
		int[] answer = new int[9];
		for (int i = 8; i >= 0; i--) {
			if (x >=0 ) {
				answer[i] = x % 2;
				x = x / 2;
			}
		}
		for (int i = 1; i <= 9; i++) 
		{
			if (answer[i-1] == 1)
				System.out.print("T ");
			else
				System.out.print("H ");
			if(i%3==0) System.out.println();
		}
	}
}