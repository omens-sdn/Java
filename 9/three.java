import java.util.GregorianCalendar;
public class three {
	public static void main(String[] args)
	{
		GregorianCalendar date=new GregorianCalendar();
		int year=date.get(GregorianCalendar.YEAR);
		int month=date.get(GregorianCalendar.MONTH)+1;
		int day=date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
		date.setTimeInMillis(1234567898765L);
		year=date.get(GregorianCalendar.YEAR);
		month=date.get(GregorianCalendar.MONTH)+1;
		day=date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println(year+"-"+month+"-"+day);
	}
}