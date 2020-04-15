public class five {
	public static void main(String[] args)
	{
		String s="";
		for(int i=0;i<8;i++)
		{
			for(int j=7-i;j>0;j--)
			{
				System.out.print(s+"    ");
			}
			for(int k=0;k<=i;k++) {System.out.printf("%4d",(int)Math.pow(2, k));}
			for(int k=i-1;k>=0;k--) {System.out.printf("%4d",(int)Math.pow(2, k));}
			for(int j=7-i;j>0;j--)
			{
				System.out.print(s+"    ");
			}
			System.out.println("\n");
		}
	}
}