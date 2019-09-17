package Assignments;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=2*n-1) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			cst=1;
			if(row==1 || row==2*n-1) {
				cst=2;
			}
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			if(row<n) {
				nst--;
				if(row==1)
				nsp=1;
				else 
					nsp+=2;
			}
			else {
				nst++;
				nsp-=2;
			}
			row++;
		}

	}

}
