package PkgArrayOfProduct;

public class TestProductArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1;
		p1 = new Product();
		p1.display(); // bydefault 0 and null;
		System.out.println("Product p1 hashcode : " + p1.hashCode());

		// p1=null;
		// System.out.println("Product p1 hashcode : "+p1.hashCode()); // Error: java.lang.NullPointerException

		Product p2;
		p2 = new Product();
		System.out.println("Product p2 hashcode : " + p2.hashCode());

		p1.accpetDetails(111, "mobile", 18999);
		p1.display();

		p2.accpetDetails(222, "LED", 14999);
		p2.display();

		
		Product arr[]=new Product[2];// array of Product(user define datatype) class 
		arr[0]=p1;
		arr[1]=p2;
		//arr=null;  // Error : java.lang.NullPointerException
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("arr[" + i + "]=" + arr[i].hashCode());
		}
		
		
		
		Product arr1[]=new Product[10];
		// Error
		/*
		Product arr1[]=new Product[10];  // This is similar to >>>>>>>>> Product p1;
		for(int i=0 ; i<arr1.length< ; i++)
		{
			System.out.println("arr[" + i + "]=" + arr[i].hashCode());
		}
		*/
		
	}

}
