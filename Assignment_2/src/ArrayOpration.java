
import java.util.Scanner;

public class ArrayOpration {

	public static void main(String[] args) {
		System.out.println("welcome");

		int choice;
		int index = 0;
		boolean flag = false;
		int k = 0;
		int m = 0;
		int p = 0;
		int r=0;

		System.out.print("Enter Array1 Size : ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];

		System.out.print("array length=" + arr1.length);
		System.out.println();
		int earr[] = new int[n1];
		int oarr[] = new int[n1];
		int primes[] = new int[n1];
		int rep[]=new int[n1];

		System.out.println("Enter Array1 Elements : ");
		for (index = 0; index < arr1.length; index++) {
			arr1[index] = sc.nextInt();
		}

		System.out.println("1 : display Array Elements \n2 : Add Array Elements : \n3 : Search Array Elements : \n4 : Short Array Elements : \n5 : Even and Odd Numbers From Array \n6 : Prime Elements From Array \n7 : Addition of all Array Elements \n9 : Finding Repeated Nubers from array\n10 : exit");
		do {
			System.out.print("\nEnter choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1: // Display
				System.out.print("Array1 Elements are : ");
				for (int i = 0; i < arr1.length; i++)
				// for (int no : arr1)
				{
					System.out.print(arr1[i] + " ");
					// System.out.print(no+" "); // ok
					// System.out.print(arr1[i]+ " "); // error
				}

				break;

			case 2:
				if (index < arr1.length) {
					System.out.print("enter element : ");
					arr1[index++] = sc.nextInt();
				} else
					System.out.println("Array is Full");
				break;

			case 3: // search
				System.out.println("enter elements for searching : ");
				int target = sc.nextInt();
				for (int i = 0; i < arr1.length; i++) {

					if (target == arr1[i]) {
						flag = true;
						break;
					}
				}
				if (flag == true)
					System.out.println("=======present=======");
				else
					System.out.println("=========not present===========");

				break;

			case 4: // shorting
				int temp;
				for (int i = 0; i < arr1.length - 1; i++) {
					for (int j = i + 1; j < arr1.length; j++)
						if (arr1[j] < arr1[i]) {
							temp = arr1[i];
							arr1[i] = arr1[j]; // swaping logic
							arr1[j] = temp;
						}

				}
				System.out.print("\nshorted array1 : ");
				for (int i = 0; i < arr1.length; i++) {
					System.out.print(arr1[i] + " ");
				}
				break;

			case 5: // even odd
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i] % 2 == 0)
						earr[k++] = arr1[i];
					else
						oarr[m++] = arr1[i];
				}
				System.out.print("even number from array : ");
				for (int i = 0; i < k; i++)
					System.out.print(earr[i] + "  ");
				System.out.print("\nodd numbers from array : ");
				for (int i = 0; i < m; i++)
					System.out.print(oarr[i] + "  ");

				break;

			case 6: // primes
				System.out.println("index="+index);
				for (int i = 0; i < index; i++) 
				{
					int num1=0;
					if (arr1[i] >= 2) 
					{
						for (int j = 1; j <= arr1[i]; j++) 
						{
							if (arr1[i] % j == 0)
								num1++;
						}
						if(num1!=2);
						else
							primes[p++]=arr1[i];
				   }
				}
			System.out.print("primes from array : ");
			for(int i=0;i<p;i++)
				System.out.print(primes[i]+" ");
				break;
			case 7: // addition
				int sum=0;
				System.out.print("sum of all array elements : ");
				for(int i=0;i<index;i++)
					sum=sum+arr1[i];
				System.out.print(sum);
				break;

			case 8:
				System.out.println("======Out Off Loop========");
				break;
			
			case 9:
				for(int i=0;i<index-1;i++)
					for(int j=i+1;j<index;j++)
						{
							if(arr1[i]==arr1[j])
						
							//System.out.println("======"+index+"and"+i+"and"+j+"and"+r++);
							rep[r++]=arr1[i];
						}
				
				System.out.print("repeated elememts from array : ");
				for(int i=0;i<r;i++)
					System.out.print(rep[i]+" ");
							
					
				break;

			default:
				System.out.println("Please Enter Valid Choice : ");
				break;

			}

		} while (choice != 9);

	}

}
