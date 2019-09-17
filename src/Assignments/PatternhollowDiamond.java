package Assignments;

import java.util.Scanner;

public class PatternhollowDiamond {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
        int row=1;
        int nst=n-n/2;
        int nsp=0;
        while(row<=n) {
        	int cst=1;
        	while(cst<=nst) {
        		System.out.print("*\t");
        		cst++;
        	}
        	int csp=1;
        	while(csp<=nsp) {
        		System.out.print("\t");
        		csp++;
        	}
        	cst=1;
        	if(row==1 || row==n)
        		cst++;
        	while(cst<=nst) {
        		System.out.print("*\t");
        		cst++;
        	}
        	System.out.println();
        	if(row<(n+1)/2) {
        		nsp+=2;
        		if(row==1)
        			nsp=1;
        		
        		nst--;
        	}
        	else {
        		nst++;
        		nsp-=2;
        	}
        	row++;
        }
	}

}
