package PkgInheritance;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(222, "akash", 40000);
		e1.salary();
		
		Manager m1=new Manager(333, "rohit", 50000, 6000);
		m1.salary();
		System.out.println(m1);
		
		salesMan s1=new salesMan(333, "shubham", 30000, 2000, 4000);
		s1.salary();
	
	}

}
