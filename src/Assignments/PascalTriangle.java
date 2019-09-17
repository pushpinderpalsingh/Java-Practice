package Assignments;

import java.util.Scanner;

public class PascalTriangle {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	  int n=scn.nextInt();
	  Pattern(n);
	}

	public static void Pattern(int n) {
		int nst=1;
		int row=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print(Com(row-1,cst)+" ");
				cst++;
			}
			System.out.println();
			nst++;
			row++;
		}  }
		public static int Com(int n, int r) {
			int ans=1;
			int i=0;
			while(i<r-1) {
				ans=ans*(n-i)/(i+1);
				i++;
			}
			return ans;
		
	}
}
