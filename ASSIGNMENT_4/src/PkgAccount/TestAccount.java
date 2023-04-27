package PkgAccount;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account s1=new Account();
		Scanner sc=new Scanner(System.in);
		
		s1.Accept("Akash", 45000);
		s1.Display();
		
		Account arr[]=new Account[5]; // it is just a declaration
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new Account(); // initializing object
			System.out.println("enter name & balance : ");
			arr[i].Accept(sc.next(), sc.nextDouble());
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].Display();
		}
		
        
	}

}
