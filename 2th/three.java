import java.util.Scanner;
public class three {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter three points for a triangle:");
	double x1=input.nextDouble();
	double y1=input.nextDouble();
	double x2=input.nextDouble();
	double y2=input.nextDouble();
	double x3=input.nextDouble();
	double y3=input.nextDouble();
	double a1=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
	double d1=Math.pow(a1,0.5);
	double a2=(x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
	double d2=Math.pow(a2,0.5);
	double a3=(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
	double d3=Math.pow(a3,0.5);
	double s=(d1+d2+d3)/2;
	double area=Math.pow(s*(s-d1)*(s-d2)*(s-d3),0.5);
	System.out.println("The area of the triangle is "+area);
}
}