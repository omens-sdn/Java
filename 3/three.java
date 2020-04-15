import java.util.Scanner;
public class three {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the temperature in Fahrenheit between -58¡ãF and 41¡ãF:");
	double t = input.nextDouble();
	System.out.println("Enter the wind speed (>=2) in miles per hour:");
	double v = input.nextDouble();
	if (t>=-58 && t<=41 && v>=2) {
	double tem = 35.74+0.6215*t-35.75*Math.pow(v,0.16)+0.4275*t*Math.pow(v,0.16);
	System.out.println("The wind chill index is " + tem);
	}
	else 
		System.out.println("input error!");
}
}