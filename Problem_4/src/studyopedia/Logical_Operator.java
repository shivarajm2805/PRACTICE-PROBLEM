package studyopedia;
import java.util.Scanner;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Is input valid (true/false): ");
		boolean input =scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean input1=scan.nextBoolean();
		boolean output= isValidInput(input,input1);
		if(output==true)
		{
			System.out.println("Input is valid.");
		}
		else
		{
			System.out.println("Input is Invalid.");
		}
		

	}
	public static boolean isValidInput(boolean a,boolean b)
	{
		return(a&&b);
	}

}
