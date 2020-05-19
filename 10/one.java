public class one {
	public static void main(String[] args)
	{
		MyInteger a=new MyInteger(5);
		MyInteger b=new MyInteger(7);
		int value=a.getValue();
		System.out.println("the value of a is "+value);
		System.out.println("a isEven? "+a.isEven()+" isOdd? "+a.isOdd()+" isPrime? "+a.isPrime());
		System.out.println("6 isEven? "+MyInteger.isEven(6)+" isOdd? "+MyInteger.isOdd(6)+" isPrime? "+MyInteger.isPrime(6));
		System.out.println("b isEven? "+MyInteger.isEven(b)+" isOdd? "+MyInteger.isOdd(b)+" isPrime? "+MyInteger.isPrime(b));
		System.out.println("a=6? "+a.equals(6));
		System.out.println("a=b? "+a.equals(b));
		char[] x={1,2,3};
		System.out.println(MyInteger.parseInt(x));
		String y="456";
		System.out.println(MyInteger.parseInt(y));
	}
}

class MyInteger{
	private int value;
	public MyInteger(int x)
	{
		value=x;
	}
	public int getValue()
	{
		return value;
	}
	public boolean isEven()
	{
		return value%2==0;
	}
	public boolean isOdd()
	{
		return value%2!=0;
	}
	public boolean isPrime()
	{
		for(int i = 2 ; i < Math.sqrt(value) ; i++)
		{
			if(value % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int v)
	{
		return v%2==0;
	}
	public static boolean isOdd(int v)
	{
		return v%2!=0;
	}
	public static boolean isPrime(int v)
	{
		for(int i = 2 ; i < Math.sqrt(v) ; i++)
		{
			if(v % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger x)
	{
		return x.value%2==0;
	}
	public static boolean isOdd(MyInteger x)
	{
		return x.value%2!=0;
	}
	public static boolean isPrime(MyInteger x)
	{
		for(int i = 2 ; i < Math.sqrt(x.value) ; i++)
		{
			if(x.value % i == 0)
				return false;
		}
		return true;
	}
	public boolean equals(int v)
	{
		return value==v;
	}
	public boolean equals(MyInteger x)
	{
		return value==x.value;
	}
	public static int parseInt(char[] a)
	{
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			x=x*10+a[i];
		}
		return x;
	}
	public static int parseInt(String a)
	{
		int y=Integer.parseInt(a);
		return y;
	}
}