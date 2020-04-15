public class six {
	public static void main(String[] args)
	{
		double sum=0;
		for(double i=1;i<98;i++)
		{
			sum+=i/(i+2);
		}
		System.out.println("The sum is:"+sum);
	}
}