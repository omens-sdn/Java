import java.util.Scanner;
public class one {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a number between 0 and 1000:");
	int x=input.nextInt();
	int y;
	if(x<10)
	{
		y=x;
	}
	else if(x>=10&&x<100)
	{
		y=x%10+x/10;
	}
	else
	{
		y=x%10+x/10%10+x/100;
	}
	System.out.println("The sun of the digits is "+y);
}
}