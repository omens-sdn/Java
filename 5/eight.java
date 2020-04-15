public class eight {
	public static void main(String[] args)
	{
		for(int j=10000;j<=100000;j=j+10000)
		{
			double e=1;
			double item=1;
			for(int i=1;i<=j;i++)
			{
				item/=i*1.0;
				e+=item;
			}
			System.out.println("j="+j+",the value of e is:"+e);
		}
	}
}