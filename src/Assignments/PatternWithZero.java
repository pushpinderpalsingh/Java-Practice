package Assignments;

import java.util.Scanner;

public class PatternWithZero {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int nst=1;
	    int val=1;
		while(row<=n)
		{
			int cst=1;
			while(cst<=nst)
			{  if(cst==1 || cst==nst)
				System.out.print(val + " ");
			else 
				System.out.print(0 + " ");
				cst++;
				
			}
			System.out.println();
			val++;
			row++;
			nst++;
		}


	}

}
