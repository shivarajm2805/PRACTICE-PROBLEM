package studyopedia;
import java.util.Scanner;


public class Method_Overloading_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=scan.nextInt();
		System.out.print("Enter the second number:");
		int b=scan.nextInt();
		System.out.print("Enter the operator (+, -, *, /):");
		String c=scan.next();
		switch(c)
		{
		case "+":
			System.out.println("Result:"+calculate(a,b,c));
			break;
		case "-":
			System.out.println("Result:"+calculate(a,c,b));
			break;
		case "*":
			System.out.println("Result:"+calculate(c,b,a));
			break;
		case "/":
			System.out.println("Result:"+calculate(b,c,a));
			break;
		default:
			System.out.println("Invalid Operation");				
			
		
			
			
		}
	}
	public static double calculate(int e,int f,String c)
	{
		return e+f;
	}
	public static double calculate(float e,String c,int f)
	{
		return e-f;
	}
	public static double calculate(String c,int f,float e)
	{
		return e*f;
	}
	public static double calculate(int f,String c,int e)
	{
		return e/f;
	}
	
}

