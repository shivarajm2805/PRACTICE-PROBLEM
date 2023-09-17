package Array.com.level_2;

public class PrintArray1 {
	void printArray(int[] arr) {
		System.out.println("Forword array");
		for(int i=0;i<arr.length;i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
//	void printReverse(int[] arr) {
		System.out.println("Reverse array");
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
