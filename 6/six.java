public class six {
	public static void main(String[] args)
	{
		System.out.println("Enter the Mersenne prime:");
		System.out.println("p      2^p-1");
		System.out.println("--------------");
		for(int i=2;i<=31;i++)
		{
			if(isPrime(i))
			{
				for(int j=1;j<=Math.pow(i,2);j++)
				{
					if(i==Math.pow(2, j)-1)
					{
						System.out.println(j+"      "+i);
						break;
					}
				}
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