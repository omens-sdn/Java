import java.util.Scanner;
public class ten {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year and what the day is the first dat of the year:");
		int year = input.nextInt();
		int week = input.nextInt();
		int day=0;
		boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		if (leap) {
			for (int i = 1; i <= 12; i++) {
				switch (i) {
				case 1:System.out.print("January 1,"+year+" is ");break;
				case 2:day+=31;System.out.print("Febuary 1,"+year+" is ");break;
				case 3:day+=29;System.out.print("March 1,"+year+" is ");break;
				case 4:day+=31;System.out.print("April 1,"+year+" is ");break;
				case 5:day+=30;System.out.print("May 1,"+year+" is ");break;
				case 6:day+=31;System.out.print("June 1,"+year+" is ");break;
				case 7:day+=30;System.out.print("July 1,"+year+" is ");break;
				case 8:day+=31;System.out.print("August 1,"+year+" is ");break;
				case 9:day+=31;System.out.print("September 1,"+year+" is ");break;
				case 10:day+=30;System.out.print("October 1,"+year+" is ");break;
				case 11:day+=31;System.out.print("November 1,"+year+" is ");break;
				case 12:day+=30;System.out.print("December 1,"+year+" is ");break;
				}
				int weeks=(day%7+week)%7;
				switch(weeks)
				{
				case 0:System.out.println("Sunday");break;
				case 1:System.out.println("Monday");break;
				case 2:System.out.println("Tuesday");break;
				case 3:System.out.println("Wednesday");break;
				case 4:System.out.println("Thursday");break;
				case 5:System.out.println("Friday");break;
				case 6:System.out.println("Saturday");break;
				}
			}
		}
		else
		{
			for (int i = 1; i <= 12; i++) {
				switch (i) {
				case 1:System.out.print("January 1,"+year+" is ");break;
				case 2:day+=31;System.out.print("Febuary 1,"+year+" is ");break;
				case 3:day+=28;System.out.print("March 1,"+year+" is ");break;
				case 4:day+=31;System.out.print("April 1,"+year+" is ");break;
				case 5:day+=30;System.out.print("May 1,"+year+" is ");break;
				case 6:day+=31;System.out.print("June 1,"+year+" is ");break;
				case 7:day+=30;System.out.print("July 1,"+year+" is ");break;
				case 8:day+=31;System.out.print("August 1,"+year+" is ");break;
				case 9:day+=31;System.out.print("September 1,"+year+" is ");break;
				case 10:day+=30;System.out.print("October 1,"+year+" is ");break;
				case 11:day+=31;System.out.print("November 1,"+year+" is ");break;
				case 12:day+=30;System.out.print("December 1,"+year+" is ");break;
				}
				int weeks=(day%7+week)%7;
				switch(weeks)
				{
				case 0:System.out.println("Sunday");break;
				case 1:System.out.println("Monday");break;
				case 2:System.out.println("Tuesday");break;
				case 3:System.out.println("Wednesday");break;
				case 4:System.out.println("Thursday");break;
				case 5:System.out.println("Friday");break;
				case 6:System.out.println("Saturday");break;
				}
			}
		}
	}
}