package lecture7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Sum {

	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr1 = TakeInput();
		int[] arr2 = TakeInput();
		System.out.println(sum(arr1, arr2));
	}
	public static int[] TakeInput() {
		int row=scn.nextInt();
		int [] arr= new int [row];
		for(int r=0;r <row; r++) {
			   arr[r]=scn.nextInt();
		}
		return arr;
	}
	public static ArrayList<Integer> sum(int[] one, int[] two){
		ArrayList<Integer> ans = new ArrayList<>();
		int i=one.length-1;
		int j=two.length-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum = carry;
			if(i>=0) {
				sum+=one[i];
			}
			if(j>=0) {
				sum+=two[j];
			}
			int rem=sum%10;
			ans.add(0,rem);
			carry= sum/10;
			i--;
			j--;
		}
		if(carry>0)
			ans.add(0,carry);
		return ans;
	}

}
