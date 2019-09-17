package Assignments;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int row=1;
		int nsp=2*n-3;
		while(row<=n) {
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(cst + "\t");
				cst++;
			}
			int csp=1;
			
			while(csp<=nsp)
			{
				System.out.print("\t");
				csp++;
			}
			int val=cst-1;
			cst=1;
			if(row==n)
			{	val--;
			    cst=2;
			}
			while(cst<=nst)
			{
				System.out.print(val+"\t");
				cst++;
				val--;
			}
			System.out.println();
			nst++;
			nsp-=2;
			row++;
		}

	}

}
