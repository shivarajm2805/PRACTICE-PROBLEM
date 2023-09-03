import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Product: ");
		String productCode=scan.next();
		getProduct(productCode);
		

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "p01":
			System.out.println("CocaCola");
			break;
		case "p02":
			System.out.println("Peps");
			break;
		case "p03":
			System.out.println("Fanta");
			break;
		case "p04":
			System.out.println("JalJeera");
			break;
		case "p05":
			System.out.println("MountainDew");
			break;
		case "p06":
			System.out.println("BoatGuava");
			break;
			default:
				System.out.println("panaka");
			
		
		}
	}

}
