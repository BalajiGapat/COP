package PkgAccount;

public class Account {
	
	private int actid;
	private String name;
	private double balance;
	private static int idcounter;
	
	static
	{
		System.out.println("=====In static block of Account class====");
		idcounter=1000;
	}
	
	
	
	
	public Account() {
		System.out.println("==========In parameterless constructor===========");
		actid=111;
		name="balaji";
		balance=98000;
	}

	public Account(String name, double balance) {
		System.out.println("=========in parametrized constructor==========");
		idcounter++;
		this.actid=idcounter;
		this.name = name;
		this.balance = balance;
	}
	
	
	
	public void Accept(String name, double balance)
	{
		idcounter++;
		this.actid=idcounter;
		this.name=name;
		this.balance=balance;
		
	}
	
	public void Display()
	{
		System.out.println("account id="+actid);
		System.out.println("name="+name);
		System.out.println("balance="+balance);
		
	}
	
	
	

}
