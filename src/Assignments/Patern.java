package Assignments;

import java.util.Scanner;

public class Patern {

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
			{
				System.out.print(val + " ");
				cst++;
				val++;
			}
			System.out.println();
			row++;
			nst++;
		}

	}

}
