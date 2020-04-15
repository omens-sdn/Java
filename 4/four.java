import java.util.Scanner;
public class four {
	public static void  main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a SSN:");
		String ssn=input.next();
		if(ssn.charAt(3)=='-'&&ssn.charAt(6)=='-')
		System.out.println(ssn+" is a valid social security number");
		else
		System.out.println(ssn+" is a invalid social security number");
	}
}