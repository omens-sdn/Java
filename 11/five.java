import java.util.ArrayList;
import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer=input.nextInt();
		list.add(answer);
		while (number1 + number2 != answer) {
			System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
			answer=input.nextInt();
			if(list.contains(answer))
				System.out.println("You already entered "+answer);
			else 
				list.add(answer);
		}
		System.out.println("You got it!");
	}
}