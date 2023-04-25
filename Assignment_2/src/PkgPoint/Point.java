package PkgPoint;

public class Point {
	
	private int x;
	private int y;
	
	public void Accept(int xx, int yy)
	{
		x=xx;
		y=yy;
		
	}
	public void Display()
	{
		System.out.println("x="+x+"\ny="+y);
	}
	
	public void SetX(int xx)
	{
		x=xx;
		System.out.println("updated Value of X="+x);
	}
	public void SetY(int yy)
	{
		y=yy;
		System.out.println("Updated Value of Y="+y);
	}
	
}
