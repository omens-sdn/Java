public class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	public LinearEquation(double A,double B,double C,double D,double E,double F)
	{
		a=A;b=B;c=C;d=D;e=E;f=F;
	}
	public double getA()
	{
		return a;
	}
	public double getB()
	{
		return b;
	}
	public double getC()
	{
		return c;
	}
	public double getD()
	{
		return d;
	}
	public double getE()
	{
		return e;
	}
	public double getF()
	{
		return f;
	}
	public boolean isSolvable()
	{
		if((a*d-b*c)!=0) return true;
		else return false;
	}
	public double getX()
	{
		double x=(e*d-b*f)/(a*d-b*c);
		return x;
	}
	public double getY()
	{
		double y=(a*f-e*c)/(a*d-b*c);
		return y;
	}
}