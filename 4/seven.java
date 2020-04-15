public class seven {
	public static void main(String[] args)
	{
		int asc1=(int)(Math.random()*(90-65+1)+65);
		char letter1=(char)asc1;
		int asc2=(int)(Math.random()*(90-65+1)+65);
		char letter2=(char)asc2;
		int asc3=(int)(Math.random()*(90-65+1)+65);
		char letter3=(char)asc3;
		int number=(int)(Math.random()*10000);
		System.out.println("The License plate is:"+letter1+letter2+letter3+String.format("%04d",number));
	}
}
