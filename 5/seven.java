public class seven {
	public static void main(String[] args)
	{
		double pi;
		for(int i=10000;i<=100000;i+=10000)
		{
			pi=0;
			for(int j=1;j<=i;j++)
			{
				pi+=(Math.pow(-1, j+1))/(2*j-1)*1.0;
			}
			pi=pi*4;
			System.out.println("i="+i+",The value of PI is:"+pi);
		}
	}
}