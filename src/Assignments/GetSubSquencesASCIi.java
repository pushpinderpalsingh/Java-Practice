package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSquencesASCIi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int ans = sub(str, new StringBuilder());
	    System.out.println();
	    System.out.println(ans);
	}
	public static int sub(String str,StringBuilder ans) {
	
		if(str.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		int mr =1;
		 StringBuilder st = new StringBuilder();
		 for(int i=0; i<ans.length();i++)
	         
		ans.append(""+(int)cc+ans+" ");
		
		int  rr = sub(ros,ans);
		mr+=rr;
		return mr;
	}

}
