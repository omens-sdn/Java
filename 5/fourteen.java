import java.util.Scanner;
public class fourteen {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1=input.nextLine();
		System.out.println("Enter the second string:");
		String s2=input.nextLine();
		int n1=s1.length();
		int n2=s2.length();
		int min;
		if(n1>n2)min=n2;
		else min=n1;
		String str="";
		for(int i=0;i<min;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				str=str+s1.charAt(i);
			else break;
		}
		if(str.length()!=0)
			System.out.println("The common prefix is "+str);
		else System.out.println(s1+" and "+s2+"have no common prefix");
	}
}