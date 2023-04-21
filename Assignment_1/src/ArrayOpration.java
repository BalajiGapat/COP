import java.util.Scanner;

public class ArrayOpration {

	public static void main(String[] args) 
	{
//		int Choice;
//		Scanner obj=new Scanner(System.in);
//		
//		
//		do {
//			System.out.println("1.Read Array\n2.Write Array\n3.Search Elements in Array\n4.Reverse Array\n5.Even Numbers From Array\n6.Sum of Array Elements\n0.Exit\nEnter Your Choice : ");
//			Choice=obj.nextInt();
//			
//		}while(Choice!=0);

		
		
		Scanner obj=new Scanner(System.in);	
		int choice;
		int search;
		boolean flag=false;
		int arr[]=new int[5];
		// Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array6:sum of array element
		do 
		{
			System.out.println("1.readArray\n2.searchArratElements\n3.reverseArrayElements\n4.EvenNumberFromArray\n5.sumOfArrayElements\n0.exit");
			System.out.println("Enter Choice : ");	
			choice=obj.nextInt();
			switch(choice)
			{
			    case 1:
			    	System.out.println("inside case 1: search array ");
					for(int i=0;i<arr.length;i++)
					{
						arr[i]=obj.nextInt();	
					}
					break;
					
			    case 2:
			    	System.out.println("enter number to find in array : ");
			    	search=obj.nextInt();
			    	for(int i=1;i<=arr.length;i++)
			    	{
			    		if(search==arr[i])
			    			flag=true;	
			    	}
			    	if(flag==true)
			    		System.out.println("enter number is present in array");	
			    	else
			    		System.out.println("enter number is not present in array");
			    	break;
			    	
			    case 3:
			    	System.out.println("array elemets are : ");
			    	for(int i=0;i<=arr.length;i++)
					{
			    		System.out.println(+arr[i]+" ");
						
					}
			    	break;
			    	
			    	
			}
			
		} while(choice!=0);

	}

}
