import java.util.Scanner;
public class one {
	public static int sumDigits(long n)
	{
		int x=0;
		do {
			x+=n%10;
			n=n/10;
		}while(n>0);
		return x;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer");
		long m = input.nextLong();
		System.out.println("The sum of the "+ m +" is "+sumDigits(m));
	}
}