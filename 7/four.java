import java.util.Scanner;
public class four {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list:");
		int number=input.nextInt();
		int[] s=new int[number];
		for(int i=0;i<number;i++)
		s[i]=input.nextInt();
		if(isSorted(s))
		{
			System.out.println("The list is already sorted");
		}
		else System.out.println("The list is not sorted");
	}
	public static boolean isSorted(int[] list)
	{
		for(int i=0;i<list.length-1;i++)
		{
			if(list[i]>list[i+1])
			{
				return false;
			}
		}
		return true;
	}
}