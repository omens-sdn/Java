public class three {
	public static void main(String[] args)
	{
		try {
			Triangle A=new Triangle(3,4,5);
			System.out.println("A: the area: "+A.getArea()+",the perimeter: "+A.getPerimeter()+"\n"+A.toString());
			Triangle B=new Triangle(1,2,3);
			System.out.println("B: the area: "+B.getArea()+",the perimeter: "+B.getPerimeter()+"\n"+B.toString());
		}
		catch(IllegalTriangleException ex)
		{
			System.out.println(ex);
		}
	}
}

class IllegalTriangleException extends Exception {
	public IllegalTriangleException() {
		super("the illegal input!");
	}
}

class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled) {
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
		return "created on" + dateCreated + "\ncolor:" + color + "and filled:" + filled;
	}
}

class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	public Triangle() throws IllegalTriangleException {

	}
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
			throw new IllegalTriangleException();
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double result;
		double s = (side1 + side2 + side3) / 2;
		result = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return result;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return "Triangle:side1=" + side1 + "side2=" + side2 + "side3=" + side3;
	}
}