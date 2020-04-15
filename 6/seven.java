public class seven {
	public static void main(String[] args)
	{
		for(int i=2;i<1000;i++)
		{
			if(isPrime(i)&&isPrime(i+2))
			{
				int temp=i+2;
				System.out.println("( "+i+" , "+temp+" )");
			}
		}
	}
	public static boolean isPrime(int p)
	{
		for(int i=2;i<p;i++)
		{
			if(p%i==0)
				return false;
		}
		return true;
	}
}