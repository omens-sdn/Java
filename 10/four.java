public class four {
	public static void main(String[] args)
	{
		MyRectangle2D r1= new MyRectangle2D(2,2,5.5,4.9);
		System.out.println("the area is "+r1.getAreac()+"\nthe perimeter is "+r1.getPerimeter());
		System.out.println("r1.contains(3, 3) "+r1.contains(3, 3)+",r1.contains(new MyRectangle2D(4,5,10.5,3.2)) "+r1.contains(new MyRectangle2D(4,5,10.5,3.2)));
		System.out.println("r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)) "+r1.overlaps(new MyRectangle2D(3,5,2.3,5.4)));
	}
}

class MyRectangle2D{
	private double x;
	private double y;
	private double width;
	private double height;
	public double getX()
	{
		return x;
	}
	public void setX(double xx)
	{
		x=xx;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double yy)
	{
		y=yy;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double w)
	{
		width=w;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public MyRectangle2D()
	{
		x=y=0;
		width=height=1;
	}
	public MyRectangle2D(double xx,double yy,double w,double h)
	{
		x=xx;
		y=yy;
		width=w;
		height=h;
	}
	public double getAreac()
	{
		return width*height;
	}
	public double getPerimeter()
	{
		return (width+height)*2;
	}
	public boolean contains(double x1,double y1)
	{
		if((x1>=x-width/2&&x1<=x+width/2)&&(y1>=y-height/2&&y1<=y+height/2))
			return true;
		return false;
	}
	public boolean contains(MyRectangle2D r)
	{
		if ((Math.abs(r.x-x)<=Math.abs(r.width-width)/2)&&(Math.abs(r.y-y)<=Math.abs(r.height-height)/2))
			return true;
		return false;
	}
	public boolean overlaps(MyRectangle2D r)
	{
		if ((Math.abs(r.x-x)<=(r.width+width)/2)&&(Math.abs(r.y-y)<=(r.height+height)/2))
			return true;
		return false;
	}
}