package lecture18;

import java.util.Scanner;

import lecture16.stack;

public class nextGreater {

	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in); 
		
		int num = scn.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		arr = nextG(arr);
		
		for(int val : arr) {
			System.out.print(val+" ");
		}

	}
	public static int [] nextG(int [] arr) throws Exception {
		
		stack s = new DynamicStack();
		int [] res = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!s.isEmpty() && arr[i]>arr[s.peek()]) {
				res[i] = arr[s.pop()];
			}
			s.push(i);
		}
		while(!s.isEmpty()) {
			res[s.pop()] = -1;
		}
		return res;
	}

}
