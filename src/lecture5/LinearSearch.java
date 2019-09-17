package lecture5;

import java.util.Scanner;

public class LinearSearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of Elements");
		int n = scn.nextInt();
		int[] arr = TakeInput(n);
		System.out.println("Enter the Number you need to search for");
		int search=scn.nextInt();
		int linearindex=LinearSearcher(arr,search);
		System.out.println(linearindex);
	}

	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int LinearSearcher(int[] arr,int n)
	{ 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
				return i;
		}
	  return -1;
	}
}
