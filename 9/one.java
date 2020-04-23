import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		Rectangle A = new Rectangle(4, 40);
		Rectangle B = new Rectangle(3.5, 35.9);
		System.out.println("the first Rectangle: " + "width: " + A.width + ",height: " + A.height + ",Area: "
				+ A.getArea() + ",Perimeter:" + A.getPerimeter());
		System.out.println("the second Rectangle: " + "width: " + B.width + ",height: " + B.height + ",Area: "
				+ B.getArea() + ",Perimeter:" + B.getPerimeter());
	}
}

class Rectangle {
	public double width = 1;
	public double height = 1;

	public Rectangle() {

	}

	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}
}