package Assignments;

import java.util.Scanner;

public class BinarySearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = TakeInput(n);

		int search=scn.nextInt();
		int linearindex=BinarySearcher(arr,search);
		System.out.println(linearindex);
	}

	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int BinarySearcher(int[] arr,int n)
	{ 
		
		 int lo=0;
		 int high=arr.length-1; 
		 int mid;
		 while(lo<=high) {
			 mid=(lo+high)/2;
			if(n>arr[mid]) {
				lo=mid+1;
			}
			else if(n<arr[mid]) {
				high=mid-1;
			}
			else 
				return mid;
		 }
	  return -1;
	}
}
