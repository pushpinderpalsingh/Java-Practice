package Assignments;

import java.util.Scanner;

import lecture16.stack;
import lecture18.DynamicStack;

public class StockSpan {

	public static void main(String[] args) throws Exception {
	   Scanner scn = new Scanner(System.in);
	   int num = scn.nextInt();
	   int[] arr = new int [num];
	   
	   for(int i=0; i<arr.length; i++) {
		   arr[i] = scn.nextInt();
	   }
	   
	   arr= stockspan(arr);
       
	   for(int val : arr) {
		   System.out.print(val + " ");
	   }
	   System.out.print("END");
	}
	
	public static int[] stockspan(int[] arr) throws Exception {
		stack s = new DynamicStack();
		int [] res = new int [arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				res[i] = i+1;
			}
			else {
				res[i] = i - s.peek();
			}
			s.push(i);
		}
		return res;
	}

}
