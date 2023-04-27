package PkgStudent;

public class Student {

	private  int rollno;
	private String name;
	private String address;
	private static int rollnocounter;
	private static String collegename;
	
	
	static
	{
		rollnocounter=202303000;
		collegename= "IACSD";
		
	}
	
	
	public Student()
	{
		rollno=111;
		name="akash";
		address="mumbai";
	}
	
	public Student(String name, String address)
	{
		this.rollno=++rollnocounter;
		//this.collegename=
		this.name=name;
		this.address=address;
		
	}
	
	public void display()
	{
		System.out.println("roll no : "+rollno);
		System.out.println("name : "+name);
		System.out.println("address : "+address);
		System.out.println("college name: "+collegename);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}

	public int getRollnocounter() {
		return rollnocounter;
	}
	
	
	// function overriding : same fun name and same signature
	public String toString()
	{
		//return "roll on:"+rollno+"  name:"+name+"  address:"+address+"   college name:"+collegename;
		return "roll on:"+rollno+"  \nname:"+name+"  \naddress:"+address+"   \ncollege name:"+collegename;
	}

}
