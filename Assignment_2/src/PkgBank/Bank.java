package PkgBank;

import java.util.Scanner;

public class Bank {

	private int aid;
	private String mno;
	private String name;
	private String email;
	private double balance;

	private static String bname;
	private static int actcounter;

	static {
		actcounter = 2023030001;
		bname = "STATE BANK OF INDIA";
	}

	Scanner sc = new Scanner(System.in);

	public void CreatAccount() {
		this.aid = actcounter++; // Assigning static variable value to instance variable

		System.out.println("enter mobile NO : ");
		this.mno = sc.next();
		System.out.println("enter name : ");
		this.name = sc.next();
		System.out.println("entee mail id : ");
		this.email = sc.next();
		System.out.println("enter balance : ");
		this.balance = sc.nextDouble();
	}

	// OR CreatAccount() method with parameter
	/*
	 * public void CreatAccount(String mno, String name, String email, double
	 * balance) {
	 * 
	 * this.aid = actcounter; this.mno = mno; this.name = name; this.email = email;
	 * this.balance = balance; }
	 */

	public void DisplayInfo() {
		// System.out.println("=====Account information=========\n");

		System.out.println("Bank name: " + bname); // static variable
		System.out.println("account number : " + aid);
		System.out.println("account holder mobile no : " + mno);
		System.out.println("account holder name: " + name);
		System.out.println("account holder mail id : " + email);
		System.out.println("account balance : " + balance);

	}

	// parameterless constructor or default constructor
	public Bank() {
		// System.out.println("====In Bank Parameterless constructor====");
		aid = 346002716;
		mno = "9096973617";
		name = "balaji";
		email = "balaji@gmail.com";
		balance = 100000;
	}

	// parameterized constructor
	public Bank(String mno, String name, String email, double balance) {
		// System.out.println("====In Bank Parameterized constructor====");
		aid = actcounter;
		this.mno = mno;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}

	public void Withdraw(double amount) {
		if (balance > amount) 
		{

			balance = balance - amount;
			System.out.println("Transaction is Successfull");
			System.out.println("Your current Balance is : " + balance);
		}
		else
			System.out.println("Insufficient balance");
	}

	public void Diposit(double amount) {
		balance = balance + amount;
		System.out.println("Transaction is Successfull");
		System.out.println("Your current Balance is : " + balance);
	}

	public void monyTransfer(Bank rcv, double amount) {

		this.balance = this.balance - amount;

		rcv.balance = rcv.balance + amount;

		System.out.println("mony fransfered from " + this.getName() + "to " + rcv.getName());

		System.out.println("current balance of " + this.getName() + " is " + this.balance);
		System.out.println("current balance of " + rcv.getName() + " is " + rcv.balance);

	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getMno() {
		return mno;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAid() {
		return aid;
	}

	public String getbname() {
		return bname;
	}

}
