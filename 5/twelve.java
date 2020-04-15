import java.util.Scanner;
public class twelve {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a decimal number: ");
	    int decimal = input.nextInt();
	    String oct = "";
	    while (decimal != 0) {
	      int octValue = decimal % 8; 
	      oct = (char)(octValue+'0') + oct;
	      decimal = decimal / 8;
	    }
	    System.out.println("The oct number is " + oct);
	  }
}