package Assignments;

import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
	int row=1;
	int nst=1;
	int nsp= n-1;
	int val;
	int val2=1;
	while(row<=2*n-1) {
		int csp=1;
		while(csp<=nsp) {
			System.out.print(" ");
			csp++;
		}
		int cst=1;
		val=val2;
		while(cst<=nst) {
			System.out.print(val);
			cst++;
			if(cst<=(nst+1)/2 ) {
				val++;
			}
			else val--;
		} 
		if(row<n) {
			nst+=2;
			nsp--;
			val2++;
		}
		else {
			val2--;
			nst-=2;
			nsp++;

		}
		System.out.println();
		row++;
	}

	}

}
