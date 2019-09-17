package Assignments;

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=2*n+1;
		int nsp=0;
		int val=n;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			val=n-row+1;
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(val+" ");
				if(cst<(nst+1)/2)
				val--;
				else val++;
				cst++;
			}
		System.out.println();
			row++;
		     nsp++;
		     nst-=2;
		}
		nsp=n;
		int csp=1;
		while(csp<=nsp)
		{
			System.out.print("  ");
			csp++;
		}
		System.out.print("0 ");
		System.out.println();
		row=1;
		nst=3;
		nsp=n-1;
		while(row<=n)
		{
	        csp=1;
			while(csp<=nsp)
			{
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			val=row;
			while(cst<=nst)
			{
				System.out.print(val+" ");
				cst++;
				if(cst<=(nst+1)/2)
					val--;
					else val++;
				}
		System.out.println();
			row++;
		     nsp--;
		     nst+=2;
		}




	}

}
