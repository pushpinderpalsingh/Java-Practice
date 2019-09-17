package Assignments;

import java.util.Scanner;

public class MirrorStarPattern {
	public static void main(String[] args) {
	     Scanner scn = new Scanner(System.in);
	     int n=scn.nextInt();
	     int row=1;
	     int nst=1;
	     int nsp=n-3;
	     while(row<=n) {
	    	 int csp=1;
	    	 while(csp<=nsp) {
	    		 System.out.print(" ");
	    		 csp++;
	    	 }
	    	 int cst=1;
	    	 while(cst<=nst) {
	    		System.out.print("*");
	    		 cst++;
	    	 }
	    	 System.out.println( );
	    	 row++;
	    	 if(row<=(n+1)/2) {
	    		 nst+=2; 
	    		 nsp--;
	    	 }
	    	 else 
	    	 {
	    		 nst-=2;
	    		 nsp++;
	    	 }
	    	
	     }
		}
}
