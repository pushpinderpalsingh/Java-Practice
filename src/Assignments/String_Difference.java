package Assignments;

import java.util.Scanner;

public class String_Difference {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	StringBuilder str = new StringBuilder();
	str.append(scn.next());
	System.out.println();

	System.out.print(str.charAt(0));
	for(int i=0;i<str.length()-1;i++) {
		int a = str.charAt(i);
		int b = str.charAt(i+1);
		System.out.print(b-a);
		System.out.print(str.charAt(i+1));
	}

	}

}
