package lecture8;

import java.util.Scanner;

public class Recursion_LastIndex {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr= TakeInput(n);
		int search=scn.nextInt();
         System.out.println(lastIndex(arr,0,search));
	}
	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int lastIndex(int[] arr, int vdx, int item) {
		if(vdx==arr.length)
			return -1;
		if(arr[vdx]==item) {
			   return vdx;
		   }
		int index = lastIndex(arr,vdx+1,item);
		   
            return index;
	}
}
