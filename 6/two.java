import java.util.Scanner;
public class two {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a integer");
		int num=input.nextInt();
		if(isPalindrome(num))
			System.out.println("The "+num+" is the reveral");
		else 
			System.out.println("The "+num+" isn't the reveral");
	}
	public static int reverse(int number)
	{
		int x=0,r=0;
		do {
			r=number%10;
			x=x*10+r;
			number=number/10;
		}while(number>0);
		return x;
	}
	public static boolean isPalindrome(int number)
	{
		if(reverse(number)==number)
			return true;
		else 
			return false;
	}
}