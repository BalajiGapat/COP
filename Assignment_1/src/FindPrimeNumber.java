import java.util.Scanner;
public class FindPrimeNumber {

	public static void main(String[] args) 
	{
		int num;
		int check=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num for checking primr number : ");
		num=obj.nextInt(); 

		if(num!=0 && num>=2)
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0) 
				{
					check++;
					break;
				}	
			}
			if(check==1)
				System.out.println(num+" is not a prime number");
			else
				System.out.println(num+" is a prime number");
		}
		else
			System.out.println(num+" is not a prime nor composite number");

	}

}
