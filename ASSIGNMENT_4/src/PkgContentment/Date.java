package PkgContentment;

import java.util.Scanner;

public class Date {
	
	private int day;
	private String month;
	private int year;
	
	
	public Date() 
	{
		day=27;
		month="march";
		year=2002;
		
	}

	public Date(int day, String month, int year) 
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	
	
	
	
	
	public void accept()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Day of Birth : ");
		 day=sc.nextInt();
		 System.out.print("Enter month(In String) of Birth : ");
		 month=sc.next();
		 System.out.print("Enter Year of Birth : ");
		 year=sc.nextInt();
	
	}
	

	public void display()
	{
		System.out.println("date of Birth : "+day+"/"+month+"/"+year);
		
	}
	
	public void SetDay()
	{
		System.out.print("Enter Day of Birth for Updatation : ");
		Scanner sc1=new Scanner(System.in);
		day=sc1.nextInt();
		
	}
	
	public void GetDay()
	{
		System.out.println("Updated Day of Birth : "+day);
	}
	
	@Override
	public String toString()
	{
		return "date : "+day+" "+month+" "+year;
	}
	


}
