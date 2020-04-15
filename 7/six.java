public class six {
	public static void main(String[] args) {
		boolean[] l=new boolean[100];
		for(int i=0;i<100;i++)
		{
			l[i]=false;
		}
		for(int i=1;i<=100;i++)
		{
			for(int j=i;j<=100;j=j+i)
			{
				l[j-1]=!l[j-1];
			}
		}
		for(int i=0;i<100;i++)
		{
			if(l[i])
				System.out.print(i+1+" ");
		}
	}
}