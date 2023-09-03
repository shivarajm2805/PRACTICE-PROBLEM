//import java.util.Scanner;
public class Fertilizer {
	int cost;
	int qty;
	float gst;
	public Fertilizer() {
//		float gst=0.18f;
//		int cost;
//		int qty;
	}
	float urea(float gst,int cost,int qty) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Quantity: ");
//		int qty=scan.nextInt();
//		float gst=0.18f;
		
		return(cost*qty+cost*gst*qty);
		
		
	}
	float dap(float gst,int cost,int qty) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Quantity: ");
//		int qty=scan.nextInt();
		
		
		return(cost*qty+cost*gst*qty);
		
		
	}
	float zinc(float gst,int cost,int qty) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Quantity: ");
//		int qty=scan.nextInt();
//		System.out.println("Enter The Cost: ");
		
		return(cost*qty+cost*gst*qty);
		
		
	}
	float boicane(float gst,int cost,int qty) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Quantity: ");
//		int qty=scan.nextInt();
		
		
		return(cost*qty+cost*gst*qty);
		
		
	}
	float pottasium(float gst,int cost,int qty) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Quantity: ");
//		int qty=scan.nextInt();
		
		
		return(cost*qty+cost*gst*qty);
		
		
	}
	

}
