package Assignments;

import java.util.Scanner;

public class FiboPattern {
 static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int row=1;
		int nst=1;
	    int val=0;
	    int val2=1;
	    int ans=0;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{  ans=val+val2;
				System.out.print(val + " ");
				cst++;
				val=val2;
				val2=ans;
			}
			System.out.println();
			
			row++;
			nst++;
		}

		
	}

}