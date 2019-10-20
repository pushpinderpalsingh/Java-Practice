package Assignments;

import java.util.Scanner;

public class MaxCircularSum {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int t =scn.nextInt();
		while(t>0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<arr.length; i++)
				arr[i]=scn.nextInt();
			System.out.println(Circular(arr));
			t--;
		}

	}
	
	public static int Circular(int[] arr) {
		 
		int internal_sum = sum(arr);
		
		int tot_sum=0;
		
		for(int i=0; i<arr.length; i++) {
			tot_sum+=arr[i];
			arr[i]=-arr[i];
		}
	   int total = tot_sum + sum(arr);
	   return Math.max(total, internal_sum);
	}
	public static int sum(int[] arr) {
		
		int maxsum= Integer.MIN_VALUE;
		int currentsum=0;
		
		for(int i=0; i<arr.length; i++) {
			currentsum+=arr[i];
			
			maxsum=Math.max(currentsum, maxsum);
			
			if(currentsum<0)
				currentsum=0;
		}
		return maxsum;
	}

}
