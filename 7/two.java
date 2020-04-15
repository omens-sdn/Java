import java.util.Scanner;
public class two {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int number=input.nextInt();
		String[] name=new String[number];
		double[] score=new double[number];
		System.out.println("Enter the name and score:");
		for(int i=0;i<number;i++)
		{
			name[i]=input.next();
			score[i]=input.nextDouble();
		}
		for(int i=0;i<number;i++) {
			int m=i;
			double min=score[i];
			for(int j=i+1;j<number;j++)
			{
				if(score[m]>score[j])
				{
					m=j;
					min=score[j];
				}
			}
			if(m!=i)
			{
				score[m]=score[i];
				score[i]=min;
				String temp=name[i];
				name[i]=name[m];
				name[m]=temp;
			}
		}
		for(int i=0;i<number;i++)
		{
			System.out.print(name[i]+" ");
		}
	}
}