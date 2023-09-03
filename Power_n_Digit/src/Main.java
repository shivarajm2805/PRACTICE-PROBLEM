
/*Write a java program to print the result of a number when it is raised 
 to the power of number of digits in the number */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.println("----");
		int n=scan.nextInt();
		Power p1=new Power();
		int res=p1.power(n);
		int res1=p1.risePower(res, n);
		System.out.println(res1);
		

}
}