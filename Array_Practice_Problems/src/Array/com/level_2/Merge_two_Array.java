package Array.com.level_2;

import java.util.Scanner;

public class Merge_two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in );
		System.out.println("Enter the length if 1st array");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the length of 2nd array");
		int []arr1=new int[scan.nextInt()];
		int num=arr.length+arr1.length;
		int []arr2=new int[num];
		System.out.println("Enetr "+arr.length+" elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enetr "+arr1.length+" elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			arr2[i+arr.length]=arr1[i];
		}
		System.out.println("Merged array is");
		for(int i=0;i<num;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
