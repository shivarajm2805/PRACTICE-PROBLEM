package Array.com.level_2;

import java.util.Scanner;

public class Roatate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter the value for rotation ");
		int num=scan.nextInt();
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a "+i+" elements ");
			arr[i]=scan.nextInt();
		}
		int k=0;
		for(int i=0;i<num;i++) {
			 k=arr[arr.length-1];
			 for(int j=arr.length-1;j>=0;j--) {
				 if(j==0)
					 arr[j]=k;
				 else	
				 arr[j]=arr[j-1];
			 }
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
