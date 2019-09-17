package lecture8;

import java.util.Scanner;

public class Recursion_MaxArray {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr= TakeInput(n);
         System.out.println(findMax(arr,0));
	}
	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int findMax(int[] arr, int vdx) {
		if(vdx==arr.length)
			return -99999;
		
		int max=findMax(arr,vdx+1);
		  if(max<arr[vdx])
			  return arr[vdx];
		  else 
			  return max;
	}

}
