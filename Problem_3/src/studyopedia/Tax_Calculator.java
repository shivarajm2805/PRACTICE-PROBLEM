package studyopedia;
import java.util.Scanner;

public class Tax_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purchase amount:");
		double purches=scan.nextDouble();
		System.out.println("Enter the Tax amount:");
		double taxrate=scan.nextDouble();
		System.out.println("Total cost including tax: "+calculateTotalWithTax(purches,taxrate));
		

	}
	public static double calculateTotalWithTax(double purchaseamount,double taxrate)
	{
		double tax=purchaseamount*taxrate;
		return purchaseamount+tax;
	}

}
