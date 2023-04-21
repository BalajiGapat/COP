import java.util.Scanner;
public class ArrayConcatination {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		
		
		System.out.print("enter array1 size: ");
		int s1=sc.nextInt();
		int[] arr1=new int[s1]; //5
		
		System.out.println("enter array1 elements:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print("arr1["+i+"]=");
			arr1[i]=sc.nextInt();
		}
		
		System.out.print("array1 elements : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"  ");
		}
		
		
		System.out.print("\nenter array2 size: ");
		int s2=sc.nextInt();
		int[] arr2=new int[s2];
		
		System.out.println("enter array2 elements:");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print("arr2["+i+"]=");
			arr2[i]=sc.nextInt();
		}
		
		System.out.print("array2 elements : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"  ");
		}
		
		
		int[] arr3=new int[s1+s2];
		int index=0;
		for(int i=0; i<arr1.length;i++)
		{
			arr3[index]=arr1[i];
			index++;
		}
		
		for(int i=0; i<arr2.length;i++)
		{
			arr3[index]=arr2[i];
			index++;
		}
		
		System.out.print("\n concat of array1 and array2 is array3 and its elements : ");
		for(int i=0; i<arr3.length;i++)
		{
			System.out.print(arr3[i]+"  ");
		}
		
		
	}

}
