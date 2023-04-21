import java.util.Scanner;
public class reverseNumber {

	public static void main(String[] args) {
		int num;
		int rev;
		int i=0;
		int arr[]=new int[100];
		System.out.println("enter number : ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		int temp=num;
		int sum=0;
		int r;
		for(i=0;num!=0;i++)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		System.out.println("reverse of "+temp+" is "+sum);
		
		if(temp==sum)
			System.out.println("given number palindrom");
		else
			System.out.println("given number is not palindrom");
	}

}
