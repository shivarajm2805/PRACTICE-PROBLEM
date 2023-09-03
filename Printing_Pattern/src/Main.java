import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		P1 q1=new P1();
		q1.pattern();

		P2 q2=new P2();
		q2.p2(n);
		System.out.println();
		P3 q3=new P3();
		q3.p3();
//		System.out.println();
		P4 q4=new P4();
		q4.p4(n);

	}

}
