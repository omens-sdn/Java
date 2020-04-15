public class three {
	public static void main(String[] args)
	{
		System.out.println("i      m(i)");
		System.out.println("----------------");
		for(int i=1;i<=20;i++)
		{
			System.out.printf("%2d      %.4f\n",i,sum(i));
			sum(i);
		}
	}
	public static double sum(int i)
	{
		double sum=0;
		for(double j=1;j<=i;j++)
		{
			sum+=j/(j+1);
		}
		return sum;
	}
}