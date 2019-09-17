package Assignments;

import java.util.Scanner;

public class ArraysReverseanArray {
 static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
	    int n = scn.nextInt();
	    int[] arr= TakeInput(n);
	    int j=arr.length-1;
	    int temp;
	    for(int i=0;i<(arr.length-1)/2;i++) {
	    	temp=arr[i];
	    	arr[i]=arr[j];
	    	arr[j]=temp;
	    	j--;
	    }
	    for(int val :arr) {
	    	System.out.println(val);
	    }
	}
	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
}
