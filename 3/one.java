import java.util.Scanner;
public class one {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the minutes:");
	long minutes = input.nextLong();
	long hours = minutes/60;
	long totaldays = hours/24;
	long years = totaldays/365;
	long currentdays = totaldays%365;
	System.out.println(minutes+"minutes is approximately "+years+" years and "+currentdays+" days");
}
}