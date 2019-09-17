package Assignments;

import java.util.Scanner;

public class RevisingQuadraticEquations {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int a= scn.nextInt();
	int b= scn.nextInt();
	int c= scn.nextInt();
	int ans= (int)Math.pow(b, 2) - 4*a*c;
	if (ans<0)
		System.out.print("Imaginary");
	else if(ans==0)
	{
		int roots = (-b + (int)Math.pow(ans, 1/2))/2*a;
		System.out.print("Real and Equal"+"\n"+roots+" "+roots);
	}
	else {
		int root1= (-b - (int)Math.sqrt(ans))/2*a;
		int root2 = (-b +(int)Math.sqrt(ans))/2*a;
		System.out.print("Real and Distinct"+"\n"+root1+ " "+ root2);
	}

	}

}
