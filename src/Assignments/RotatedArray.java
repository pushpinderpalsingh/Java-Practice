package Assignments;

import java.util.Scanner;

public class RotatedArray {

	public static void main(String[] args) {
		int[] arr =TakeInput();
        int min=arr[0];
		for(int i=1; i<=arr.length-1;i++) {
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println(min);
	}
	public static int[] TakeInput() {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr= new int [n];
		for(int r=0;r <n; r++) {
			   arr[r]=scn.nextInt();
			
		}
		return arr;
	
	}
	
}
