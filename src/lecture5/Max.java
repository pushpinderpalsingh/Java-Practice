package lecture5;

import java.util.Scanner;

public class Max {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of Elements");
		int n = scn.nextInt();
		int[] arr = TakeInput(n);
		int maxindex = max(arr);
		System.out.println(maxindex);
	}

	public static int[] TakeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int max(int[] arr) {
		int max = -9999;
		for (int i = 0; i < arr.length; i++) {
			if (max <=arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
