package PkgContentment;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.display();
		System.out.println(obj);
		
		System.out.println("\n\n");
		
		
		Employee obj1;
		obj1=new Employee(555, "abhijit", 26, 40000, new Date(11, "jan", 1996));
		obj1.display();
		System.out.println(obj1);
		
		System.out.println("\n\n");
		
		Employee obj2=new Employee();
		obj2.Accept(1234, "shubham", 27, 23000, new Date(10, "june", 1997)); // Explicit call to accept fun of Employee class
		obj2.display();
		System.out.println(obj2);
		
		System.out.println("\n\n");
		
		
		
		Scanner sc=new Scanner(System.in);
		
		Employee obj3=new Employee();
		System.out.println(" Enter eplid, name, age, salary, dayofbirth, month, year; ");
		obj3.Accept( sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble(), new Date( sc.nextInt(), sc.next(), sc.nextInt()));
		obj3.display();
		System.out.println(obj3);
		

	}

}
