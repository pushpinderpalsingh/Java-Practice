package Assignments;

import java.util.Scanner;

public class ArraysMaxValueInArray {

	public static void main(String[] args) {
		int[] arr =TakeInput();
		int max=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(max);
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
