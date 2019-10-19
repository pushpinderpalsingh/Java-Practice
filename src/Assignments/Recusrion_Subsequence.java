package Assignments;

import java.util.Scanner;

public class Recusrion_Subsequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		sub(scn.next(), 0);

	}
	public static void sub(String str, int cnt) {
		if(str.length()==0)
			return;
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		System.out.print(ch+ " ");
		
		sub(ros,cnt+1);
		System.out.println();
	if(str.length()>=cnt) {
		String ch2 = str.substring(0,cnt);
	    String ros2 = str.substring(cnt);
	    System.out.print(ch2 + " ");
	    sub(ros2, cnt+1);

	}
	}

}
