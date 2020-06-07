import java.util.Scanner;
public class four {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a hex number: ");
	    try
	    {
	    	String hex = input.nextLine();
	    	System.out.println("The decimal value for hex number "+ hex + " is " + hexToDecimal(hex.toUpperCase()));
	    }
	    catch(HexFormatException ex) 
	    {
	    	System.out.println(ex);
	    }
	  }
	  public static int hexToDecimal(String hex) throws HexFormatException {
	    int decimalValue = 0;
	    for (int i = 0; i < hex.length(); i++) {
	      char hexChar = hex.charAt(i);
	      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
	    }
	    return decimalValue;
	  }
	  public static int hexCharToDecimal(char ch) throws HexFormatException {
	    if (ch >= 'A' && ch <= 'F')
	    	return 10 + ch - 'A';
	    else if((ch>='a')&&(ch<='f'))
	    	return 10 + ch - 'a';
	    else if(ch>='0'&&ch<='9')
	    	return ch - '0';
	    else
	    	throw new HexFormatException();
	  }
}

class HexFormatException extends Exception{
	public HexFormatException() {
		super("The string is not hexadecimal!");
	}
}