package Assignments;

import java.util.Scanner;

public class PatternX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=0;
		int nspmid=n+1;
		int val=1;
		while(row<=(2*n-1))
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
				System.out.print(val);
				cst++;
			}
		    csp=1;
		    while(csp<=nspmid)
		    {
		    	System.out.print(" ");
		    	csp++;
		    }
		    cst=1;
		    if(row==((2*n-1)/2)+1)
		    cst=2;
			while(cst<=nst)
			{
				System.out.print(val);
				cst++;
			}
		    if(row>(2*n-1)/2)
		    {  
		    	nsp--;
		    	nspmid+=2; 
		    	val--;
		    	
		    }
		    else {
		    	nsp++;
		    	nspmid-=2;
		    	val++;
		    	    }
		    
		    
		    System.out.println();
			row++;
		}

	}

}
