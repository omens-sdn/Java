import java.util.Scanner;
public class one {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int number=input.nextInt();
		double max1=0,max2=0;
		String name1="",name2="";
		for(int i=0;i<number&&number>=2;i++)
		{
			System.out.println("Enter the name and score of the student"+i+":");
			String n1=input.next();
			double s1=input.nextDouble();
			if(s1>=max1)
			{
				max2=max1;
				name2=name1;
				max1=s1;
				name1=n1;
			}
			else if(s1>=max2)
			{
				max2=s1;
				name2=n1;
			}
		}
		System.out.println("The first highest score is:"+name1+" "+max1);
		System.out.println("The second highest score is:"+name2+" "+max2);
	}
}