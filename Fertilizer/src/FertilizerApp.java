import java.util.Scanner;

public class FertilizerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float gst=0.18f;
		Scanner scan=new Scanner(System.in);
		System.out.println("Type of Fertilizers ");
		System.out.println("------------------------------------------");
		System.out.println("1.Urea 2.DAP 3.Pottasium 4.Zinc 5.Biocane ");
		System.out.println("------------------------------------------");
		System.out.print("Enter a your chioce: ");
		int type=scan.nextInt();
		Fertilizer f1=new Fertilizer();
		float num1=0,num2=0,num3=0,num4=0,num5=0;
		for(int i=1;i<=type;i++) {
		System.out.print("Enter a Fertilizer Type: ");
		int ferti=scan.nextInt();
		System.out.print("Enter a Quantity: ");
		int qty=scan.nextInt();
		switch(ferti) {
		case 1:
			num1=f1.urea(gst,300,qty);
		break;
		case 2:
			num2=f1.dap(gst,1500,qty);
			break;
		case 3:
			num3=f1.pottasium(gst,850,qty);
			break;
		case 4:
			num4=f1.zinc(gst,700,qty);
			break;
		case 5:
			num5=f1.boicane(gst,500,qty);
			break;
			default:
				System.out.println("Invalid choice ");
		
		}
	}
		System.out.println("--------------------------------");
		System.out.println("Total Amount is: "+(num1+num2+num3+num4+num5)+" /- Rs Only");
		System.out.println("Please Visit Again");
		System.out.println("Thank You...");
	}
}
