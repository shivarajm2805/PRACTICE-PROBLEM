import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Digit d1=new Digit();
		int res=d1.count(n);
		System.out.println(res);
		int res1=d1.cube(res,n);
		System.out.println(res1);
		if(res1==n) {
			System.out.println("The given number "+n+" is Armstrong Number");
		}
		else {
			System.out.println("The given number "+n+" is not Armstrong Number");
		}
//		Armstrong a=new Armstrong();
//		System.out.println(a.thearmstrong(n));
//		ArmstrongToRise a1=new ArmstrongToRise();
//		int res=a1.digi(n);
//		System.out.println(res);
//		int res1=a1.riseArmstrong(n, res);
//		System.out.println(res1);
//		if(res1==n) {
//			System.out.println("The given number "+n+" is Armstrong Number");
//		}
//		else {
//			System.out.println("The given number "+n+" is not Armstrong Number");
//		}
		

	}

}
