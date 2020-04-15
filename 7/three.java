import java.util.Scanner;
public class three {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=input.nextInt();
		double[] s=new double[number];
		for(int i=0;i<number;i++)
		{
			s[i]=input.nextDouble();
		}
		for(int i=0;i<number-1;i++)
		{
			int m=i;
			double min=s[i];
			for(int j=i+1;j<number;j++)
			{
				if(min>s[j])
				{
					m=j;
					min=s[j];
				}
			}
			if(m!=i)
			{
				s[m]=s[i];
				s[i]=min;
			}
		}
		for(int i=0;i<number;i++)
		System.out.print(s[i]+" ");
	}
}