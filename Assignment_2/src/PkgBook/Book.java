package PkgBook;

public class Book {
	
	/*
	 4:  Create a class Book with data members as bname,id,author,price. Write getters and setters for all the data members. 
	 Also add the display function.  
     Create the object of this class in main method and invoke all the methods in that class.
	 */
	
	private String bname;
	private int bid;
	private String author;
	private int price;
	
	
	
	public void accept(String bnm, int id, String autr, int pr)
	{
		bname=bnm;
		bid=id;
		author=autr;
		price=pr;
	}
	
	public void display()
	{
		System.out.println("book name : "+bname);
		System.out.println("book book id : "+bid);
		System.out.println("book author name : "+author);
		
	}
	
	public void SetBname(String bnm)
	{
		bname=bnm;
	}
	public String GetBname()
	{
		return bname;
	}
}
