package lecture5;

import java.util.Scanner;

public class TakeInputDisplayArray {
   static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of Elements");
		int n= scn.nextInt();
		int[] arr= TakeInput(n);
		display(arr);
		}
	public static int[] TakeInput(int n)
	{ int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	

}
