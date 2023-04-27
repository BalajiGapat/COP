package PkgContentment;

public class Employee {
	private int eid;
	private String name;
	private int age;
	private double salary;
	private Date dd;
	
	
	
	public Employee() 
	{
		eid=111;
		name="mahesh";
		age=20;
		salary=20000;
		dd=new Date(); // call to default construction of Date class
	}
	

	
	public Employee(int eid, String name, int age, double salary, Date dd) 
	{
	
		this.eid = eid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dd = dd;  // passing reference >> this.dd hold reference of dd & dd holds reference of parameterized constructor
	}
	
	public void Accept(int id, String nm, int ag, double slry, Date dd)
	{
		eid=id;
		name=nm;
		age=ag;
		salary=slry;
		this.dd=dd; 
	}
	
	
	public void display()
	{
		System.out.println("ID of Employee : "+eid);
		System.out.println("Name of Employee : "+name);
		System.out.println("Age of Employee : "+age);;
		System.out.println("Salary of Employee : "+salary);
		System.out.println("date of birth : "+dd);  //
	}
	public void SetName(String uname)
	{
		name=uname;
	}
	
	public String GetName()
	{
		return name;
	}
	
	
	@Override
	public String toString()
	{
		return "employee id: "+eid+"  name:"+name+"   age:"+age+"   salary:"+salary+"   date of birth:"+dd;
	}
	
	
}
