package Assignments;

import java.util.Scanner;

public class PatternTriangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n)
		{   int val=row;
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print(val);
				if(cst<=(nst)/2)
					val++;
				else val--;
				cst++;

			}
		System.out.println();
			row++;
		     nsp--;
		     nst+=2;
		}

	}

}
