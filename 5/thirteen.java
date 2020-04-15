import java.util.Scanner;
public class thirteen {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a srting:");
		String s=input.next();
		int n=0;
		String ss="";
		while(n<s.length())
		{
			ss=s.charAt(n)+ss;
			n++;
		}
		System.out.println("The reversed string is "+ss);
	}
}