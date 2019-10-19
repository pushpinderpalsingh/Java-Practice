package Assignments;

import java.util.Scanner;

public class LongestSubarraywithEqual01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		int num=scn.nextInt();
		int[] arr = new int [num];
		
		while(t>0) {
		for(int i=0; i<arr.length; i++)
			arr[i]=scn.nextInt();
		
		int si=-1;
		int ei=-1;
		
		for(int i=0;i<arr.length; i++) {
			int countZ=0;
			int countO=0;
			
			for(int j=i; j<arr.length; j++) {
				 if(arr[j]==0)
					 countZ++;
				 else if(arr[j]==1)
					 countO++;
				if(countZ==countO) { 
				 if( ei - si < j-i) {
					 si = i;
					 ei = j;
				 }
				}
			}
		}
		if(si!=-1)
		System.out.print(si + " " + ei);
		else
			System.out.print("none");
		System.out.println();
		t--;
		}
	}
}
