import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);

	}
	public static void findGCD(int a, int b) {
		int gcd=1;
		for (int i=1;i<b;i++) {
			if (a%i==0 && b%i==0) {
				gcd=i;
				}
		}
		System.out.println(gcd);
	}
};
