import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) 
	{
		//System.out.println("welcome");
				Scanner sc=new Scanner(System.in);
				int num;
				int ans=1;
				System.out.println("enter num for finding factorial : ");
				num=sc.nextInt();
				
				for(int i=1;i<=num;i++)
				{
					ans=ans*i;
					
				}
				System.out.println("factorial of "+num+" is "+ans);

	}

}
