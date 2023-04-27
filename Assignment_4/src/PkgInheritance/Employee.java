package PkgInheritance;

public class Employee 
{
	
	private int eid;
	private String name;
	protected double salary;
	
	public Employee() 
	{
		super();
		eid=111;
		name="mahesh";
		salary=20000;
	}
	
	public Employee(int eid, String name, double salary) 
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public void salary() 
	{
		System.out.println("in employee class salary : "+salary);
	}

	@Override
	public String toString() 
	{
		return "eid="+eid+"   name="+name+"    salary="+salary;
	}
	

}
