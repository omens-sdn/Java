public class three {
	public static void main(String[] args)
	{
		Circle x=new Circle(3);
		Circle y=new Circle(5);
		System.out.println("the result of comparison is: "+x.compareTo(y));
		System.out.println("x equals to y? "+x.equals(y));
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
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Comparable<Circle> {
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
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
	public int compareTo(Circle a) {
		if (getArea() > a.getArea())
			return 1;
		else if (getArea() < a.getArea())
			return -1;
		else
			return 0;
	}
	public boolean equals(Object o) {
		if (o instanceof Circle)
			return radius == ((Circle) o).radius;
		else
			return this == o;
	}
}