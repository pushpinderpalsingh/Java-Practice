package Assignments;

import java.util.Scanner;

public class PatternDoubleCross {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		int nspmid=1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			int cspmid=1;
			if(row==1 || row==n)
				cspmid=2;
			while(cspmid<=nspmid) {
				System.out.print(" ");
				cspmid++;
			}
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<(n+1)/2)
			{	
				nspmid+=2;
				nsp-=2;
				nst++;
			}
			else {
				nspmid-=2;
				nsp+=2;
				nst--;
			}
			row++;
		}

	}

}
