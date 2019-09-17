package Assignments;

import java.util.Scanner;

public class LongestSubarraywithSum {
static	Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
	int n=scn.nextInt();
	while(n>0) {
	int[] arr= TakeInput(); 
	int ans = longestsubsum(arr); 
	System.out.println(ans);  
	n--;
	}

	}
	public static int[] TakeInput() {
		
		int n=scn.nextInt();
		int[] arr= new int [n];
		for(int r=0;r <n; r++) {
			   arr[r]=scn.nextInt();
			
		} 
		scn.close();
		return arr;
	}
	public static int longestsubsum(int[] arr) {
		int count=0;
		int counrev=arr.length;
		while(counrev>=0) {
			int sum=0;
			int ans=0;
			for(int i=count; i<counrev;i++) {
				sum+=arr[i];
				ans++;
			}
			if(sum>0) {
				return ans;
			}
			counrev--;
		}
      while(count<arr.length) {
    			int sum=0;
    			int ans=0;
    			for(int i=count; i<counrev;i++) {
    				sum+=arr[i];
    				ans++;
    			}
    			if(sum>0) {
    				return ans;
    			}
    			count--;
      }
      while(count<arr.length) {
			int sum=0;
			int ans=0;
			for(int i=count; i<counrev;i++) {
				sum+=arr[i];
				ans++;
			}
			if(sum>0) {
				return ans;
			}
			count++;
			counrev--;
}
      for(int i=0; i<arr.length;i++) {
    	  if(arr[i]>0) {
    		  return 1;
    	  }
    		  
      }
      return -1;
	}
}
