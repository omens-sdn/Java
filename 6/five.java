import java.util.Scanner;
public class five {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string and a char");
		String s=input.next();
		char a= input.next().charAt(0); //ÊäÈëÒ»¸öchar
		System.out.println("the count is "+count(s,a));
	}
	public static int count(String str,char a)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
			{
				count++;
			}
		}
		return count;
	}
}