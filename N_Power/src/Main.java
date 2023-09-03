import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		Digit d1=new Digit();
		System.out.println(d1.digit(n, m));

	}

}
