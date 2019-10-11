package Assignments;

import java.util.Scanner;

public class AlexGoesShopping {
static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = TakeInput();
		int q=scn.nextInt();
		while(q>0) {
			int yes=0;
			int money=scn.nextInt();
			int k=scn.nextInt();
			for(int i=0; i<arr.length; i++) {
			if(money%arr[i]==0) {
			     	yes++;
			 }
			}
			if(yes>=k) {
				System.out.println("Yes");
			}
			else 
				System.out.println("No");
			q--;
		}
	}
	public static int[] TakeInput() {
		int n=scn.nextInt();
		int[] arr= new int [n];
		for(int r=0;r <n; r++) {
			   arr[r]=scn.nextInt();
			
		}
		return arr;
	
	}
}
