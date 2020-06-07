import java.util.Scanner;
public class one {
	public static void main(String[] args)
	{
		System.out.println("Enter the number:");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		Triangle x=new Triangle(a,b,c);
		System.out.println("the area: "+x.getArea()+",the perimeter: "+x.getPerimeter()+","+x.toString());
	}
}

abstract class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }
	  public String getColor() {
	    return color;
	  }
	  public void setColor(String color) {
	    this.color = color;
	  }
	  public boolean isFilled() {
	    return filled;
	  }
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }
	  public abstract double getArea();
	  public abstract double getPerimeter();
	}

class Triangle extends GeometricObject{
	private double a;
	private double b;
	private double c;
	public Triangle() {
		
	}
	public Triangle(double aa,double bb,double cc) {
		a=aa;
		b=bb;
		c=cc;
	}
	public double getA()
	{
		return a;
	}
	public void setA(double aa)
	{
		a=aa;
	}
	public double getB()
	{
		return b;
	}
	public void setB(double bb)
	{
		b=bb;
	}
	public double getC()
	{
		return c;
	}
	public void setC(double cc)
	{
		c=cc;
	}
	public double getArea()
	{
		double area;
		double s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return area;
	}
	public double getPerimeter() {
		return a+b+c;
	}
}