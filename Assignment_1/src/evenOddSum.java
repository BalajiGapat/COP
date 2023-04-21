import java.util.Scanner;
public class evenOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int esum=0;
		int osum=0;
		System.out.println("enter num= ");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		
		for(int i=1;i<=num;i++) // 12
		{
			if(i%2==0)
				esum=esum+i;
			else
				osum=osum+i;
		}
		System.out.println("sum of even number from 1 to "+num+" is : "+esum);
		System.out.println("sum of odd number from 1 to "+num+" is : "+osum);
		System.out.println("sun of all numbers from 1 to "+num+" is :"+(esum+osum));
		

	}

}
