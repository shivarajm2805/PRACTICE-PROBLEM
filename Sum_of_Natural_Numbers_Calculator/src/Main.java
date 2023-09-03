import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a nummber");
		int n=scan.nextInt();
		 calculateSum( n);

	}
	public static void calculateSum(int n) {
		int count=0;
		for (int i=1;i<=n;i++) {
			count=count+i;
		}
		System.out.println(count);
//		int sum=n*(n+1)/2;
//		System.out.println(sum);
	}

}
