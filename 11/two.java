import java.util.ArrayList;
import java.util.Scanner;
public class two {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =input.nextInt();
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println("\nThe max is "+max(list));
	}
	
	public static Integer max(ArrayList<Integer> list)
	{
		if(list.isEmpty()||list.size()==0)
		{
			return 0;
		}
		Integer max=list.get(0);
		for(int i=0;i<list.size();i++)
		{
			if(max<list.get(i))
				max=list.get(i);
		}
		return max;
	}
}