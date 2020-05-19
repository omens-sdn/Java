import java.util.Scanner;
public class two {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int x=input.nextInt();
		StackOfIntegers m=new StackOfIntegers();
		int i=2;
		while(x!=1)
		{
			if(x%i==0)
			{
				m.push(i);
				x/=i;
			}
			else
			{
				i++;
			}
		}
		while(!m.empty())
		{
			System.out.print(m.pop()+" ");
		}
	}
}