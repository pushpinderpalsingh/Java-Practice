package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Recusrion_Subsequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = sub(str);
	for(String val: ans) {
		System.out.print(val+" ");
	}
	System.out.println();
		System.out.println((int)Math.pow(2, str.length()));

	}
	public static ArrayList<String> sub(String str) {
	
		if(str.length()==0) {
			ArrayList<String> base = new ArrayList<String>();
			base.add(" ");
			return base;
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String>  rr = sub(ros);
		ArrayList<String>  mr = new ArrayList<String>();
		
		for(String val : rr) {
			mr.add(val);
			mr.add(cc + val);
		}
		
		return mr;
	}

}
