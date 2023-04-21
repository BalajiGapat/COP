import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		
		System.out.print("enter three digit num: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int r;
		int sum=0;
		for(int i=0; num!=0; i++)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("given number is amstrong");
		else
			System.out.println("given nmber is not amstrong");
	}

}
