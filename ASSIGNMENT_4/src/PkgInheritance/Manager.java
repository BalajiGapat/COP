package PkgInheritance;

public class Manager extends Employee
{
	
	private int incentives;
	
	
	public Manager()
	{
		super();  // Constructor call must be the first statement in a constructor
		incentives=5000;
		
	}
	
	public Manager(int eid, String name, double salary, int incentives)
	{
		super(eid, name, salary); // Constructor call must be the first statement in a constructor
		this.incentives=incentives;
	}
	
	public void provideMnaPower()
	{
		System.out.println("==provide man power==");
	}

	@Override
	public void salary() 
	{
		System.out.println("salary of manager:"+(super.salary+this.incentives));
	}

	@Override
	public String toString() {
		
		return super.toString()+"incentives: "+incentives;
	}
	
	

}
