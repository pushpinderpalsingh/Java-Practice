package lecture8;

import java.util.Scanner;

public class Recursion_Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(Fact(n));

	}
	public static int Fact(int n) {
		if(n==1)
			return 1;
		return n*Fact(n-1);
	}

}
