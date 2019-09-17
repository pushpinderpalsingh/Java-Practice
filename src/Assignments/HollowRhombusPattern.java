package Assignments;

import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n=scn.nextInt();
     int row=1;
     int nst=n;
     int nsp=n-1;
     while(row<=n) {
    	 int csp=1;
    	 while(csp<=nsp) {
    		 System.out.print(" ");
    		 csp++;
    	 }
    	 int cst=1;
    	 while(cst<=nst) {
    		if(row==1 || cst==1 || cst==nst || row==n)
    		 System.out.print("*");
    		else System.out.print(" ");
    		 cst++;
    	 }
    	 System.out.println( );
    	 row++;
    	 nsp--;
     }
	}

}
