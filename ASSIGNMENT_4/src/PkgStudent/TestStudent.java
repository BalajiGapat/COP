package PkgStudent;
import java.util.Scanner;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		
		Student std1=new Student("Shubham", "Sambhajinagar");
		//std1.display(); 
		System.out.println(std1);
		
		
		System.out.println("-------------------");
		
		Student std2=new Student("sachin", "pune");
		std2.display();
		System.out.println("-------------------");
		
		Student std3=new Student("saurabh", "thane");
		std3.display();
		System.out.println("-------------------");
		
		Student std4=new Student("abhijit", "dddd");
		std4.display();
		System.out.println("-------------------");

		Student std5=new Student("ankita", "nagpur");
		std5.display();
		System.out.println("-------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size : ");
		int s=sc.nextInt();
		Student array[]=new Student[s];  // just array declaration
		// similar to Student std1;
		
		for(int i=0 ; i<array.length ; i++)
		{
			System.out.print("enter name & address ");
			array[i]=new Student(sc.nextLine(), sc.nextLine());
		}
		
		for(int i=0 ; i<array.length ; i++)
		{
			array[i].display();
			System.out.println("-------------------");
		}
	}
}
