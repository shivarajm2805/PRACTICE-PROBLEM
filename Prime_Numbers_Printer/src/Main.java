import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();

		int count=0;
		for(int j=2;count<n;j++) 
		{

			boolean res=printPrimes(j);
			if (res==true) 
			{
				System.out.print(j+" ");
				count++;
			}		
			
		}
			
	}
	public static boolean printPrimes(int n)
	{
		for(int i=2;i<n;i++) 
		{
			if(n%i==0) 
			{
			
				return false;
			}
		}
		return true;

}
}
