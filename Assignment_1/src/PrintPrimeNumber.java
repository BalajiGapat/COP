import java.util.Scanner;

public class PrintPrimeNumber 
{

	
	
	private static boolean isPrime(int num) 
	{
		if (num >= 2) 
		{
			for (int i = 2; i <= num / 2; i++) 
			{
				if (num % i == 0)
					return false;
			}
		}
		return true;
	}

	
	
	public static void main(String[] args) 
	{

		System.out.println("enter num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print("prime numbers from 1 to " + num + " is : ");
		for (int i = 2; i <= num; i++) 
		{

			if (isPrime(i)) 
			{
				System.out.print(i + " ");
			}

		}
	}
}




