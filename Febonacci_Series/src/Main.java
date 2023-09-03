import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		printFibonacciSeries(n);

	}
	public static void printFibonacciSeries(int n) {
		
		int num1=0,num2=1;
		if (n==1) {
			System.out.println(num1);
		}
		else if (n==2) {
			System.out.println(num1+" "+num2);
		}
		else
		{
		System.out.print(num1+" "+num2);
		
		for (int i=2;i<n;i++) {
			int n3;
			n3=num1+num2;
			num1=num2;
			num2=n3;
//			System.out.print(num1);
			System.out.print(" "+num2);
			
		}
	}

}
}

