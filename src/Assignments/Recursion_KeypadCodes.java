package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion_KeypadCodes {

	public static void main(String[] args) {
	    Scanner scn = new Scanner(System.in);
		ArrayList<String> ans = kc(scn.next());
		for(String str : ans)
			System.out.print(str +" ");
		System.out.println();
		System.out.print(ans.size());
	}
	
	public static ArrayList<String> kc(String num) {
      if(num.length()==0) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add("");
			return bc;
		}
		
		int no =Integer.parseInt(num.substring(0,1));
		String ros = num.substring(1);
		
		String cc = NumtoString(no);
		ArrayList<String> rr = kc(ros);
		ArrayList<String> ans = new ArrayList<String>();
		
			for(int i=0; i<cc.length() ; i++) {
				for(String val : rr) 
			ans.add(""+cc.charAt(i)+ val );
		}
			
		return ans;
		
	}
	
	public static String NumtoString(int num) {
		if(num == 1)
			return "abc";
		else if(num==2)
			return "def";
		else if(num==3)
			return "ghi";
		else if(num==4)
			return "jkl";
		else if(num==5)
			return "mno";
		else if(num==6)
			return "pqrs";
		else if(num==7)
			return "tuv";
		else if(num==8)
			return "wx";
		else 
			return "yz";
		
	}

}
