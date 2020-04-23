public class four {
	public static void main(String[] args)
	{
		RegularPolygon A= new RegularPolygon();
		RegularPolygon B= new RegularPolygon(6,4);
		RegularPolygon C= new RegularPolygon(10,4,5.6,7.8);
		System.out.println("the first RegularPolygon's perimeter is "+A.getPerimeter()+",the area is "+A.getArea());
		System.out.println("the second RegularPolygon's perimeter is "+B.getPerimeter()+",the area is "+B.getArea());
		System.out.println("the thirst RegularPolygon's perimeter is "+C.getPerimeter()+",the area is "+C.getArea());
	}
}
class RegularPolygon{
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	public RegularPolygon()
	{
		
	}
	public RegularPolygon(int nn,double s)
	{
		n=nn;
		side=s;
	}
	public RegularPolygon(int nn,double s, double xx,double yy)
	{
		n=nn;
		side=s;
		x=xx;
		y=yy;
	}
	public int getN()
	{
		return n;
	}
	public void setN(int N)
	{
		n=N;
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double s)
	{
		side=s;
	}
	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public double getPerimeter()
	{
		return n*side;
	}
	public double getArea()
	{
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
}