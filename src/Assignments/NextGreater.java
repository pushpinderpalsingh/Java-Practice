package Assignments;

import java.util.Scanner;

import lecture16.stack;
import lecture18.DynamicStack;

public class NextGreater {

	public static void main(String[] args) throws Exception {
	Scanner scn = new Scanner(System.in);
	 int t = scn.nextInt();
	 
	 while(t>0) {
		 int num = scn.nextInt();
		 int[] arr = new int [num];
		 for(int i=0; i< num ; i++) {
			 arr[i] = scn.nextInt();
		 }
		 
		 int[] res = ng(arr);
		 
		 for(int val : res) {
			 System.out.print(val + " ");
		 }
		 System.out.println();
		 t--;
	 }
	}
	
	public static int[] ng(int[] arr) throws Exception {
		stack s = new DynamicStack();
		int [] res = new int [arr.length];
		
		for(int i=0; i< arr.length; i++) {
			while(!s.isEmpty() && arr[s.peek()] < arr[i]) {
				res[s.pop()] = arr[i];
			}
			s.push(i);
		}
		
		while(!s.isEmpty()) {
			res[s.pop()] = -1;
		}
		return res;
	}

}
