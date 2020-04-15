import java.util.Scanner;
public class eleven {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a decimal number: ");
	    int decimal = input.nextInt();
	    String bin = "";
	    while (decimal != 0) {
	      int binValue = decimal % 2; 
	      bin = (char)(binValue+'0') + bin;
	      decimal = decimal / 2;
	    }
	    System.out.println("The bin number is " + bin);
	  }
}