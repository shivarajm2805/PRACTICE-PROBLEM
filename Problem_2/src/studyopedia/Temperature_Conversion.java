package studyopedia;
import java.util.Scanner;

public class Temperature_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Temperature Conversion Tool!");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select an Option");
		System.out.println("1 For Convert Celsius to Fahrenheit");
		System.out.println("2 For Convert Fahrenheit to Celsius");
		System.out.println("Enter your choice:");
		int option=scan.nextInt();
		if (option==1) 
		{
		System.out.println("Enter the temperature in Celsius:");
		double c=scan.nextDouble();
		double d=(celsiusToFahrenheit(c));
		System.out.println(c+"C is equivalent to "+d+"F");
		}
		else if(option==2) 
		{
		System.out.println("Enter the temperature in Fahrenheit:");
		double Fahrenheit=scan.nextDouble();
		double e=fahrenheitToCelsius(Fahrenheit);
		System.out.println(Fahrenheit+"°F is equivalent to "+e+"C");
		}
		else
		{
			System.out.println("Enter a valid Option");
		}
		

	}
	public static double celsiusToFahrenheit(double c)
	{
		return (c * 9/5 + 32);
	}
	public static double fahrenheitToCelsius(double F)
	{
		return((F - 32) * 5/9);
		
	}

}
