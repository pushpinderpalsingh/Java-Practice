package Assignments;

import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n= scn.nextInt();
     int row=1;
     int nsp=n-1;
     int nst=1;
     int nspmid=0;
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
    	  csp=1;
    	  while(csp<=nspmid)
    	  {
    		  System.out.print(" ");
    		  csp++;
    	  }
    	  cst=1;
    	  if(row==1||row==n)
    		  cst=100;
    	  while(cst<=nst)
    	  {
    		  System.out.print("*");
    	  }
    	  if(row<=(n+1)/2)
    	  {
    		  nsp--;
    		  nspmid+=2;
    		  nst++;
    	  }
    	  else {
    		  nsp++;
    		  nspmid-=2;
    		  nst--;
    	  }
    	  if(row==2)
    		  nspmid=1; 
    	  row++;
      }

	}

}
