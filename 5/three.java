import java.util.Scanner;
public class three {
  public static void main(String[] args) 
  {
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter the first integer:");
	  int n1=input.nextInt();
	  System.out.println("Enter the second integer:");
	  int n2=input.nextInt();
	  int d;
	  if(n1<n2) d=n1;
	  else d=n2;
	  for(;d>0;d--)
	  {
		  if(n1%d==0&&n2%d==0)  break;
	  }
	  System.out.println("The greatest common divisor is "+d);
  }
}