package PkgPoint;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		
		Point pobj=new Point();
		System.out.println("enter Value of X and Y :");
		
		Scanner sc=new Scanner(System.in);
		
		pobj.Accept( sc.nextInt(), sc.nextInt() );
		pobj.Display();
		
		System.out.println("enter New Value of X : ");
		pobj.SetX( sc.nextInt() );
		pobj.SetY( sc.nextInt() );
		
		System.out.println("=====After Updetation=====");
		pobj.Display();
	

	}

}
