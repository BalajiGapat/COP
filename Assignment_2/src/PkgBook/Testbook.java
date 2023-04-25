package PkgBook;
import java.util.Scanner;

public class Testbook {

	public static void main(String[] args) {
		
		
		Book var;
		var=new Book();
		var.accept("Basic of C Language", 123, "Yashawant Kanitkar", 599);
		var.display();
		
		System.out.println("enter updated name of book : ");
		Scanner sc=new Scanner(System.in);
		//String newnm=sc.next();
		var.SetBname(sc.next());
		System.out.println("updated name : "+var.GetBname());
		var.display();
				

	}

}
