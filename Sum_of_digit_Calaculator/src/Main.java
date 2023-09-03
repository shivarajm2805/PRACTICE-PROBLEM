import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		 calculateSumOfDigits(n);

	}
	public static void calculateSumOfDigits(int n) {
		int sum=0;
		int a=0;
		
		while(n>0)
		{
			a=n%10;
			sum=sum+a;
			n=n/10;
			
		}
		System.out.println(sum);
		
		
		

}
}
