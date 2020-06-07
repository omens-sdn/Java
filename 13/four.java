import java.util.Scanner;
public class four {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first complex number:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		System.out.println("Enter the second complex number:");
		double c=input.nextDouble();
		double d=input.nextDouble();
		Complex x=new Complex(a,b);
		Complex y=new Complex(c,d);
		System.out.println("("+x+") + ("+y+") ="+x.add(y));
		System.out.println("("+x+") - ("+y+") ="+x.substract(y));
		System.out.println("("+x+") * ("+y+") ="+x.multiply(y));
		System.out.println("("+x+") / ("+y+") ="+x.divide(y));
		System.out.println("|("+x+")| = "+x.abs());
	}
}

class Complex extends Number implements Cloneable{
	private double realpart=0;
	private double imaginarypart=0;
	public Complex()
	{
		
	}
	public Complex(double a)
	{
		realpart=a;
	}
	public Complex(double a,double b)
	{
		realpart=a;
		imaginarypart=b;
	}
	public double getRealpart()
	{
		return realpart;
	}
	public double getImaginarypart()
	{
		return imaginarypart;
	}
	public Complex add(Complex x) 
	{
		double a=realpart+x.realpart;
		double b=imaginarypart+x.imaginarypart;
		return new Complex(a,b);
	}
	public Complex substract(Complex x) 
	{
		double a=realpart-x.realpart;
		double b=imaginarypart-x.imaginarypart;
		return new Complex(a,b);
	}
	public Complex multiply(Complex x) 
	{
		double a=realpart*x.realpart-imaginarypart*x.imaginarypart;
		double b=imaginarypart*x.realpart+realpart*x.imaginarypart;
		return new Complex(a,b);
	}
	public Complex divide(Complex x) 
	{
		double a=(realpart*x.realpart+imaginarypart*x.imaginarypart)/(x.realpart*x.realpart+x.imaginarypart*x.imaginarypart);
		double b=(imaginarypart*x.realpart-realpart*x.imaginarypart)/(x.realpart*x.realpart+x.imaginarypart*x.imaginarypart);
		return new Complex(a,b);
	}
	public double abs()
	{
		return Math.sqrt(realpart*realpart+imaginarypart*imaginarypart);
	}
	public String toString()
	{
		if(imaginarypart==0)
			return ""+realpart;
		else
			return realpart+" + "+imaginarypart+"i";
	}
	public Object clone() throws  CloneNotSupportedException
	{
		return super.clone();
	}
	public int intValue()
	{
	    return (int)doubleValue();
	}
	  public float floatValue() 
	{
	    return (float)doubleValue();
	}
	  public double doubleValue() 
	{
	    return realpart+imaginarypart*Math.sqrt(-1);
	}
	  public long longValue() 
	{
	    return (long)doubleValue();
	}
}