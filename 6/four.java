import java.util.Scanner;
public class four {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a password");
		String password=input.next();
		if(isValid(password))
			System.out.println("Valid password");
		else
			System.out.println("Invalid password");
		
	}
	public static boolean isValid(String pass)
	{
		int count=0;
		if(pass.length()>=8)
		{
			for(int i=0;i<pass.length();i++)
			{
				if((pass.charAt(i)<=57&&pass.charAt(i)>=48))
				{
					count++;
				}
				else if((pass.charAt(i)<=89&&pass.charAt(i)>=65)||(pass.charAt(i)<=122&&pass.charAt(i)>=97))
				{
					continue;
				}
				else 
					return false;
			}
			if(count>=2)
			{
				return true;
			}
			else
				return false;
		}
		else 
			return false;
	}
}