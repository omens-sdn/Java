import java.util.*;
public class two {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the integers:");
			try {
				int a = input.nextInt();
				int b = input.nextInt();
				int sum = a + b;
				System.out.println("the sum of the two integers is " + sum);
				break;
			}
			catch (InputMismatchException ex) {		
				input.nextLine();//input.next();//input.reset();
			}
		}
	}
}