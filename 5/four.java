import java.util.Scanner;
public class four {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a=input.nextInt();
		int i = 2;
		while (true) {
			if (a % i == 0) 
			{
				System.out.println(i + " ");
				a /= i;
			} 
			else
				i++;
			if (a == 1) break;
		}
	}
}