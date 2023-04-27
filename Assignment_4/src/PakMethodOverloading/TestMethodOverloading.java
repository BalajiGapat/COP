package PakMethodOverloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mobj=new MethodOverloading();
		
		mobj.multi(2, 4);
		mobj.multi(4, 2,3,2,1,1,1,1,1,1,1,1,1,1,1,1,1); // dynamic signature
		
		mobj.multi(5.5, 5); 
		int result=mobj.multi(1, 2, 3);
		System.out.println("result : "+result);

	}

}
