import java.util.Scanner;
public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num= ");
		num=obj.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of series= "+sum);

	}

}
