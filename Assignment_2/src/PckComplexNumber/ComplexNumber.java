package PckComplexNumber;
import java.util.Scanner;

public class ComplexNumber {
	
	private int real;
	private int imag;
	
	
	public void Accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Real Number : ");
		real=sc.nextInt();
		
		System.out.println("Enter imaginary number : ");
		imag=sc.nextInt();
	}
	
	public void Display()
	{
		System.out.print("Real no="+real+"\nImaginary no="+imag);
	}
	
	public void SetReal(int r)
	{
		real=r;
	}
	
	public int GetReal(int i)
	{
		return real;
	}
	
	public void SetImaginary(int i)
	{
		imag=i;
	}
	
	public int GetImaginay()
	{
		return imag;
	}

}
