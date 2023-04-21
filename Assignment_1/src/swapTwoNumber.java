import java.util.Scanner;
public class swapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		System.out.println("enter n1=");
		Scanner obj=new Scanner(System.in);
		n1=obj.nextInt();
		
		int n2;
		System.out.println("enter n2=");
		Scanner obj1=new Scanner(System.in);
		n2=obj1.nextInt();
		
		System.out.println("before swap "+n1+" & "+n2);
		
		n1=n1*n2;
		n2=n1/n2;
		n1=n1/n2;
		System.out.println("before swap "+n1+" & "+n2);

	}

}
