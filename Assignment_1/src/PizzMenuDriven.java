import java.util.Scanner;

public class PizzMenuDriven {

	public static void main(String[] args) 
	{
		System.out.println("1: Pizza type 1 price=100");
		System.out.println("2: Pizza type 2 price=150");
		System.out.println("3: Pizza type 3 price=200");
		System.out.println("4: Pizza type 4 price=250");
		System.out.println("5: Pizza type 5 price=300");
		System.out.println("0: exit");
		
		Scanner sc=new Scanner(System.in);
		int ch;
		int amount=0;
		do
		{
			System.out.println("enter choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				int price1=100;
				amount=amount+price1;
				break;
				
			case 2:
				int price2=150;
				amount=amount+price2;
				break;
				
			case 3:
				int price3=200;
				amount=amount+price3;
				break;
				
			case 4:
				int price4=250;
				amount=amount+price4;
				break;
				
			case 5:
				int price5=300;
				amount=amount+price5;
				break;
				
			case 0:
				break;
				
			default :
				System.out.println("invalid input");
				break;
			}
		}while(ch!=0);
		
		System.out.println("Total bill = "+amount+" \nThank you visit again");

	}

}
