package PkgEmployee;
import java.util.Scanner;
import PkgDate.Date;

public class TestEmployee {

	public static void main(String[] args) {
		
		Scanner sobj;
		sobj=new Scanner(System.in);
		
		Employee obj;
		obj=new Employee();
		
		System.out.println("Enter Employee id, name, age, salary : ");
		obj.Accept( sobj.nextInt(), sobj.next(), sobj.nextInt(), sobj.nextDouble() );
		
		//calling anather calss i.e Date Class
		Date dobj=new Date();
		dobj.accept();
		System.out.println();
		
		
		
		obj.display(); // call to Employee class
		dobj.display(); // call to date class
		
		
		
		
		
		
		//System.out.print("enter name for updetation : ");
		//obj.SetName(sobj.next());
		//System.out.println("updated name : "+obj.GetName());
		
		
		/*
		 
		//
		obj.Accept(123, "balaji", 26, 45000);
		obj.display();
		System.out.print("Enter Name of Employe to Update : ");
	    obj.SetName( sobj.next() );
	    System.out.println("\nupdated name : "+obj.GetName());
	    System.out.println("====After Updatation===\n");
		obj.display();
		//
		
		
		//OR
		System.out.println("enter New name of Employee for Updatation : ");
		String uname=sobj.next();
		obj.SetName(uname);
		
		System.out.print("updated name : ");
		String unm=obj.GetName();
		System.out.println(unm);
		System.out.println("====After Updatation===\n");
		obj.display();
		//
		 
		 */
		
		
		/*
		System.out.println("Enter Employee id : ");
		int  id=sobj.nextInt();
		System.out.println("Enter Employee name : ");
		String nm=sobj.next();
		System.out.println("Enter Employee age : ");
		int ag=sobj.nextInt();
		System.out.println("Enter Employee salary : ");
		int saly=sobj.nextDouble();
		obj.Accept(saly, nm, ag, saly);
		obj.display();
		*/
		

		
	}

}
