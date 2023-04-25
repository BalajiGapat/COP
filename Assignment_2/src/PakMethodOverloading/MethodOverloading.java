package PakMethodOverloading;

public class MethodOverloading {
         
	
	public void multi(int n1, int n2)
	{
		System.out.println("multiplication="+(n1*n2) );
	}
	
	public void multi(int n1, double n2)
	{
		System.out.println("multiplication="+(n1*n2));
	}
	
	public void multi(double n1, double n2)
	{
		System.out.println("multiplication="+(n1*n2));
	}
	
	public void multi(double n1, int n2)
	{
		System.out.println("multiplication="+(n1*n2));
	}
	
	
	//dynamic signature :varArgs
	// accept zero or many numbers of arguments 
	// if no of parameters to function is more than 1 ten varargs must be at last
	public void multi(double n1, int...is) 
	{	
		System.out.print("multi : ");
		for(int i=0;i<is.length;i++)
			n1=n1*is[i];
		System.out.println(n1);
	}
	
	public int multi(int n1, int n2, int n3)
	{
		return n1*n2*n3;
	}
}
