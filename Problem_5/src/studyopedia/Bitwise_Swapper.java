package studyopedia;
import java.util.Scanner;

public class Bitwise_Swapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int first=scan.nextInt();
		System.out.println("Enter the second integer:");
		int second =scan.nextInt();
		swapUsingBitwise(first,second);	

	}
	public static void swapUsingBitwise(int a,int b)
	{
		int temp;
		temp=a^b;
		a=a^temp;
		b=b^temp;
		System.out.println("After swapping:First = "+a+","+"second = "+b);
	}

}
