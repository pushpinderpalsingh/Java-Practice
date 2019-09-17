package lecture8;

import java.util.Scanner;

public class Recursion_nthFibo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(Fibo(n));

	}
	public static int Fibo(int n) {
	     if(n==1 || n==0) {
	    	 return n;
	     }
	     int fib1= Fibo(n-1);
	     int fib2 = Fibo(n-2);
		  return fib1+fib2;
	}

}
