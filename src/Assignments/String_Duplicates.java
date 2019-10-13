package Assignments;

import java.util.Scanner;

public class String_Duplicates {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		str.append(scn.next());
		
		StringBuilder printstr = new StringBuilder();
		printstr.append(str.charAt(0));
		
		
		for(int i=1; i<str.length(); i++) {
		     if(str.charAt(i)==str.charAt(i-1))
		    	 continue;
		     printstr.append(str.charAt(i));
		}
		System.out.println(printstr);
	}

	}


