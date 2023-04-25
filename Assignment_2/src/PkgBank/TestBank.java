package PkgBank;

import java.util.Scanner;

import PkgDate.Date;

public class TestBank {

	public static void main(String[] args) {

		int choice;

		Scanner sc = new Scanner(System.in); // creating object of Scanner(predefined) class
		Bank bobj;
		bobj= new Bank(); // parameterless constructor get call //creating object of Bank class
		Date dob = new Date(); // compiler-parameterless constructor get call //creating object of date class

		System.out.println("1: Create Account ");
		System.out.println("2: Get  Account information ");
		System.out.println("3: Update in Name : ");
		System.out.println("4: Update mobile No : ");
		System.out.println("5: Get Balance ");
		System.out.println("6: Show Account No : ");
		System.out.println("7: Update mail id  ");
		System.out.println("8: Withdraw Amount from Account ");
		System.out.println("9: Deposite Amount in Account ");
		System.out.println("10: Get Bank Name ");
		System.out.println("11: Create multiple account at a time Account ");
		System.out.println("12: Money Tranfer ");

		System.out.println("0: Exit : ");

		do {
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				bobj.CreatAccount();
				dob.accept();

				// bobj.CreatAccount(sc.nextInt(), "9096973617", "balaji", "balaji@gmail.com",
				// 600000);
				break;

			case 2:
				bobj.DisplayInfo();
				dob.display();
				break;

			case 3:
				System.out.println("enter correct name for correction : ");
				bobj.setName(sc.next());
				String uname = bobj.getName();
				System.out.println("Updated name : " + uname);
				// OR
				// System.out.println("Updated name : "+bobj.getName());

				break;

			case 4:
				System.out.println("enter correct mobile number for correction : ");
				bobj.setMno(sc.next());
				System.out.println("Update Mobile No : " + bobj.getMno());

				break;

			case 5:
				System.out.println("Your account balance : " + bobj.getBalance());
				break;

			case 6:
				System.out.println("Your Account number : " + bobj.getAid());
				break;
			case 7:
				System.out.println("Enter mail for correction : ");
				bobj.setEmail(sc.next());
				System.out.println("Updated mail id : " + bobj.getEmail());
				break;

			case 8:
				System.out.println("enter amount for withdraw : ");
				bobj.Withdraw(sc.nextDouble());

				break;

			case 9:
				System.out.println("enter amount to deposit : ");
				bobj.Diposit(sc.nextDouble());
				break;

			case 10:
				System.out.println("Your bank name : " + bobj.getbname());
				break;

			case 11:
				System.out.println("Enter how many account you want to create : ");
				int size = sc.nextInt();
				
				// creating array of object OR creating array of user define datatype(i.e class)
				Bank[] array = new Bank[size]; // array declaration only no initialization
				Date darray[] = new Date[size]; // array declaration only no initialization
				
				
				// Accepting data from user
				for (int i = 0; i < array.length; i++) 
				{
					array[i]=new Bank();         // similar to   >>>  bobj = new Bank();
					array[i].CreatAccount();     // object initialization
					
					darray[i]=new Date();
					darray[i].accept();
				}

				// printing data
				for (int i = 0; i < array.length; i++) 
				{
					array[i].DisplayInfo();
					darray[i].display();
				}

				break;
			
				
				
			case 12:
				
				Bank mt1=new Bank(); 
				Bank mt2=new Bank();  
				System.out.println("Enter details of sender account:");
				mt1.CreatAccount();  
				System.out.println("Enter amount to transfer : ");
				double amount=sc.nextDouble();
				
				System.out.println("Enter details of receiver account:");
				mt2.CreatAccount(); 
				
				mt1.monyTransfer(mt2, amount);			
				break;
				
				
			case 0:
				System.out.println("=====Thank You Visit Again=====");
				break;

			default:
				System.out.println("Please Enter Correct Choice : ");
				break;
			}

		} while (choice != 0);
	}

}
