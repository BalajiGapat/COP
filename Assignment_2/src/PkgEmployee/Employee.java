package PkgEmployee;

public class Employee {
	
	private int eid;
	private String name;
	private int age;
	private double salary;
	
	public void Accept(int id, String nm, int ag, double slry)
	{
		eid=id;
		name=nm;
		age=ag;
		salary=slry;
	}
	public void display()
	{
		System.out.println("ID of Employee : "+eid);
		System.out.println("Name of Employee : "+name);
		System.out.println("Age of Employee : "+age);;
		System.out.println("Salary of Employee : "+salary);
	}
	public void SetName(String uname)
	{
		name=uname;
	}
	public String GetName()
	{
		return name;
	}
	
	

}
