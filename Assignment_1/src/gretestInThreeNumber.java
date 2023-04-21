import java.util.Scanner;
public class gretestInThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter num1= ");
		num1=obj.nextInt();
		
		System.out.println("enter num1= ");
		num2=obj.nextInt();
		
		System.out.println("enter num1= ");
		num3=obj.nextInt();
		
		//System.out.println("gretest number : "+(num1>num2 ? num1>num3?num1:num3 : num2>num3?num2:num3));
		
		if(num1>num2 && num1>num3)
			System.out.println("num1 is max");
		if(num2>num1 && num2>num3)
			System.out.println("num2 is max");
		if(num3>num1 && num3>num2)
			System.out.println("num3 in max");

       
	}

}
