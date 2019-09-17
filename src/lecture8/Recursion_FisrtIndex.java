package lecture8;

import java.util.Scanner;

public class Recursion_FisrtIndex {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr= TakeInput(n);
		int search=scn.nextInt();
         System.out.println(firstIndex(arr,0,search));
	}
	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static int firstIndex(int[] arr, int vdx, int item) {
		if(vdx==arr.length)
			return -1;
		
		int index = firstIndex(arr,vdx+1,item);
		   if(arr[vdx]==item) {
			   index=vdx;
		   }
            return index;
	}
}
