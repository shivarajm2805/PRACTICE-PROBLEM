import java.util.Scanner;

public class Main {
	

		public static void identifyPolygon(int sides)

		{

		switch(sides)
		{
		case 3:
			System.out.println("triangle");
			break;
		
		
		case 4:
			System.out.println("Quadrilateral");
			break;
		
		case 5:
			System.out.println("Pentagon");
			break;
		
		case 6:
			System.out.println("Hexagon");
			break;
		
		default:
			System.out.println("Polygon");

		}
		}

		public static void main(String[] args)

		{

		//Taking the input and method call here.
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a sides:");
			int sides=scan.nextInt();
			identifyPolygon(sides);

		}

}

