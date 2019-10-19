package Assignments;

import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t=scn.nextInt();
	while(t>0) {
	int num = scn.nextInt();
	int[] arr = new int [num];
	
	for(int i =0;i< arr.length; i++)
		arr[i]=scn.nextInt();
	
	sort(arr);
	for(int val : arr)
		System.out.print(val);
   t--;
	}
	}
	
	public static void sort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++)
		{ 
			for(int j=0; j< arr.length-1-i ; j++) {
			if(comp(arr[j],arr[j+1])==true) {
				
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			} }
		}
	}
	public static boolean comp(int arr , int arr2) {
		
		String str1= "" + arr+arr2;
		String str2 = "" + arr2+arr;
		
		int ans= str1.compareTo(str2);
		
		if(ans>0)
			return false;
		else return true;
	}

}
