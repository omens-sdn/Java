public class nine {
	public static void main(String[] args)
	{
		int count=0;
		for(int year=101;year<=2100;year++)
		{
			if((year%4==0&&year%100!=0)||year%400==0)
			{
				count++;
				if(count%10==0)
				{
					System.out.println(year);
				}
				else 
					System.out.print(year+" ");
			}
		}
		System.out.println("The number of leap year is "+count);
	}
}