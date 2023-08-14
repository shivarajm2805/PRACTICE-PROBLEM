package studyopedia;

import java.util.Scanner;

public class Calculator_delimma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a operator");
		String a=scan.next();
		System.out.println("Enter a Number");
		int b=scan.nextInt();
		int c=scan.nextInt();
		Calculate(a,b,c);
	}
	public static void Calculate(String a,int b,int c) {
	
		switch(a)
		{
		case "+": 
			System.out.println(b+c);
			break;
		case "-":
			System.out.println(b-c);
			break;
		case "*":
			System.out.println(b*c);
			break;
		case "/":
			System.out.println(b/c);
			break;
		default:
			System.out.println("enter a valid input");
		}	
	}
}
