import java.util.Scanner;
public class six {
  public static void main(String[] args) {   
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a point with two coordinates:");
	    int x = input.nextInt();
	    int y = input.nextInt();
	    double d = Math.pow(x*x+y*y, 0.5);
	    if (d<= 10)
	    System.out.println("Point ( "+ x +".0 ,"+ y +".0 ) is in the circle");
	    else
	    System.out.println("Point ( "+ x +".0 ,"+ y +".0 ) is not in the circle");
  }
}