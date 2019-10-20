package lecture18;

import java.util.Scanner;

import lecture16.stack;

public class StockSpan {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		
		int num = scn.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		int [] res= stockspan(arr);
		
		System.out.print(res+" ");
	}
    public static int [] stockspan(int[] arr) throws Exception {
    	stack s = new DynamicStack();
    	
    	int res[] = new int[arr.length];
    	
    	for(int i=0; i<arr.length;i++) {
    		while(!s.isEmpty() && arr[i]>arr[s.peek()]) {
    			s.pop();
    		}
    		if(s.isEmpty()) {
    			res[i] = i+1;
    		}
    		else {
    			res[i]=i - s.peek() ;
    		}
    	}
    	return res;
    	
    }
}
