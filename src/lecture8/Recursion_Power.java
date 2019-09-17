package lecture8;

import java.util.Scanner;

public class Recursion_Power {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(power(n,b));

	}
	public static int power(int n, int b) {
		if(b==0)
			return 1;
		 return n*power(n,b-1);
	}

}
