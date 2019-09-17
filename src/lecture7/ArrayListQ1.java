package lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQ1 {

	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr1 = TakeInput();
		int[] arr2 = TakeInput();
		System.out.println(intersection(arr1, arr2));
	}
	public static int[] TakeInput() {
		int row=scn.nextInt();
		int [] arr= new int [row];
		for(int r=0;r <row; r++) {
			   arr[r]=scn.nextInt();
		}
		return arr;
	}
	public static ArrayList<Integer> intersection(int[] one, int[] two){
		int i=0;
		int j=0;
		ArrayList<Integer> ans = new ArrayList<>();
		while(i<one.length && j<two.length) {
			if(one[i]<two[j])
				i++;
			else if(one[i]>two[j])
				j++;
			else {
				ans.add(one[i]);
				i++;
				j++;
			}
		}
		return ans;
	}
	

}
