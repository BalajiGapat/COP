import java.util.Scanner;
public class numberOfPowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int n;
		int result=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter num : ");
		num=obj.nextInt();
		
		System.out.println("enter n : ");
		n=obj.nextInt();
		
		System.out.println("num="+num+" & n="+n);
		
		if(n!=0)
		{
			if(n>0)
			{
				for(int i=1;i<=n;i++)
				{
					result=result*num;
				}
				System.out.println("result= "+result);
				
				
			}
			if(n<0)
			{
				for(int i=-1;n<=i;i--)
				{
					result=-result*num;
				}
				System.out.println("result= "+result);
				
			}
		}
		else
			System.out.println("ans= "+1);


	}

}
