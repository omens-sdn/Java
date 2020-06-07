public class two {
	public static void main(String[] args)
	{
		Circle x1=new Circle(5);
		Circle x2=new Circle(4);
		Rectangle y1=new Rectangle(3,4);
		Rectangle y2=new Rectangle(4,5);
		System.out.println("the max of the two circles is: ");
		System.out.println(GeometricObject.max(x1, x2)==x1?"x1":"x2");
		System.out.println("the max of the two rectangles is: ");
		System.out.println(GeometricObject.max(y1, y2)==y1?"y1":"y2");
	}
}

abstract class GeometricObject implements Comparable<GeometricObject> {
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
	  public int compareTo(GeometricObject a)
	  {
		  if(getArea()>a.getArea())
			  return 1;
		  else if(getArea()<a.getArea())
			  return -1;
		  else
			  return 0;
	  }
	  public static GeometricObject max(GeometricObject a,GeometricObject b)
	  {
		  if(a.compareTo(b)==1)
			  return a;
		  else if(a.compareTo(b)==-1)
			  return b;
		  else 
			  return a;
	  }
	}

class Circle extends GeometricObject {
  private double radius;
  public Circle() {
	  
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }
  @Override
  public double getArea() {
    return radius * radius * Math.PI;
  }
  public double getDiameter() {
    return 2 * radius;
  }
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  public void printCircle() {
    System.out.println("The circle is created " + getDateCreated() +
      " and the radius is " + radius);
  }
}

class Rectangle extends GeometricObject {
  private double width;
  private double height;
  public Rectangle() {
	  
  }
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  @Override
  public double getArea() {
    return width * height;
  }
  @Override
  public double getPerimeter() {
    return 2 * (width + height);
  }
}