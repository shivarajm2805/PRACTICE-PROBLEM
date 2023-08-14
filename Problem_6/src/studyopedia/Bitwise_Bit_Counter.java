package studyopedia;
import java.util.Scanner;

public class Bitwise_Bit_Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integer:");
		int a=scan.nextInt();
		System.out.println("Number of set bits: "+countSetBits(a));
		

	}
	public static int countSetBits(int b)
	{
		int c;
		return(b&~b);
	}

}
