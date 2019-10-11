package Assignments;

import java.util.Scanner;

public class Arrays_TripletsSum {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int [] arr = TakeInput();
		arr=insertionsort(arr);
        arraypair(arr);
	}
	public static int[] TakeInput() {
		int n=scn.nextInt();
		int[] arr= new int [n];
		for(int r=0;r <n; r++) {
			   arr[r]=scn.nextInt();
			
		}
		return arr;
	
	}
	public static int[] insertionsort(int [] arr) {
		for(int cnt=1; cnt<=arr.length-1;cnt++) {
			int temp = arr[cnt];
			int j=cnt-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	public static void arraypair(int [] arr) {
		int target = scn.nextInt();

		for(int i=0; i<arr.length;i++)		
		{	int low=i+1;
		    int high= arr.length-1;
			while(low<high) {
			int sum = arr[low]+arr[high]+arr[i];
			
			if(sum<target)
				low++;
			else if(sum>target)
				high--;
			else 
				{
				System.out.print(arr[i]+ " , " + arr[low]+ " and " + arr[high] + "\n");
				low++;
				high--;
				}
		}
	} }
}
