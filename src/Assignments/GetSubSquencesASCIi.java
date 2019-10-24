package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSquencesASCIi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ArrayList<String> ans = sub(str);
	    for(String val : ans)
	    	System.out.print(val + " ");
	    System.out.println();
	    System.out.println(ans.size());
	}
	public static ArrayList<String> sub(String str) {
	
		if(str.length()==0) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add(" ");
			return bc;
		}
		
		char cc = str.charAt(0);
		int num = cc;
		String no = Integer.toString(num);
		String ros = str.substring(1);
		ArrayList<String> rr = sub(ros);
		ArrayList<String> mr = new ArrayList<String>();
		
		for(String val : rr)
			mr.add(val);
		
		for(String val : rr)
			mr.add(cc+val);
		
		for(String val : rr)
			mr.add(""+num+val);
		return mr;
	}

}
