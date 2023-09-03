import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		calculateFactorial(n);

	}
	public static void calculateFactorial(int n) 
	{
		if (n==0) 
		{
			System.out.println("1");
		}
		else 
		{
		int count=1;
		for (int i=1;i<=n;i++) 
		{
			count=count*i;
		}
		System.out.println(count);
		}
	}

}
