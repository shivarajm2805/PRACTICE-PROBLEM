package Array.com.level_2;

import java.util.Scanner;

public class Array_Odd_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a length of array");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Odd numbers are");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}

	}

}
