package Array.com.level_2;

import java.util.Scanner;

public class Swap_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int []arr=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array elements "+i);
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Before Swapping");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter a Two index for swapping");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		System.out.println("After swapping: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
