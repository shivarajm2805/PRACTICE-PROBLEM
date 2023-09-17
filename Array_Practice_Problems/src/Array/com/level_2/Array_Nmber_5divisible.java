package Array.com.level_2;

import java.util.Scanner;

public class Array_Nmber_5divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a length of array");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Number are divisible by 5:");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0)
				System.out.print(arr[i]+" ");
		}

	}

}
