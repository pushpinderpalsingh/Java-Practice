package Assignments;

import java.util.Scanner;

public class ReplaceThemAll {
  static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
        int n=scn.nextInt();
        String x = new String();
        x=Integer.toString(n);
        
		x= x.replace("0","5");
		System.out.println(x);
	}
}
