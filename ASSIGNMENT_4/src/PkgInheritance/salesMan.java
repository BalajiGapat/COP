package PkgInheritance;

public class salesMan extends Employee {
	

	private int ta;
	private int fa;
	
	
	public salesMan() 
	{
		super();
		ta=2000;
		fa=5000;
	}


	public salesMan(int eid, String name, double salary, int ta, int fa) 
	{
		super(eid, name, salary);
		this.ta = ta;
		this.fa = fa;
	}
	
	
	@Override
	public void salary()
	{
		System.out.println("salary of salesman:"+(super.salary+this.ta+this.fa));
	}
	
	

}
