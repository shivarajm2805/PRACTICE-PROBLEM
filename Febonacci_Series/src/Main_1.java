
//Print a 8th Fibonacci Number

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		findFeb(n);

	}
	public static void findFeb(int m) {
		int num1=0;
		int num2=1;
		int num3;
		if(m==0) {
			System.out.println(num1);
		}
		else if(m==1) {
			System.out.println(num2);
			
		}
		else {
//			System.out.print(num1+" "+num2);
			for (int i=2;i<m;i++) {
				num3=num1+num2;
				num1=num2;
				num2=num3;
//				if(i==10) {
//				System.out.print(" "+num2);
			}
			System.out.print(" "+num2);
		}
	}
	

}
