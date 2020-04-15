import java.util.Scanner;
public class two {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the time zone offset to GMT:");
	int zone = input.nextInt();
	long totalseconds = System.currentTimeMillis()/1000;
	long currentseconds = totalseconds%60;
	long totalminutes = totalseconds/60;
	long currentminutes = totalminutes%60;
	long totalhours = totalminutes/60;
	long currenthours = totalhours%24;
	long hours = currenthours + zone;
	System.out.println("The current time is " + hours + ":" + currentminutes + ":" + currentseconds);
}
}