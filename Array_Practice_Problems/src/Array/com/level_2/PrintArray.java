package Array.com.level_2;
import java.util.Arrays;
import java.util.Scanner;
public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		PrintArray1 print=new PrintArray1();
		print.printArray(arr);
		

	}

}
