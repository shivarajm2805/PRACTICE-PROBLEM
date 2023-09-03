import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);

	}
	public static void findGCD(int m,int n) {
		int rem;
		while(n!=0) {
			rem=m%n;
			m=n;
			n=rem;
			
		}
		System.out.println(m);
		
	}

}
