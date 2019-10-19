package Assignments;

import java.util.Scanner;

public class Recursion_isBalanced {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(isB(scn.next(),new StringBuilder()));

	}
	public static boolean isB(String str, StringBuilder ans) {
		if(str.length()==0) {
			return ans.length()==0;
		}
		
		String ch = str.substring(0,1);
		String ros = str.substring(1);
		
		if(ch=="{" || ch=="[" || ch == "(") {
			ans.append(ch);
			return isB(ros,ans);
		} 
		else if(ch=="}" || ch=="]" || ch==")") {
			   if(ans.length()==0)
				   return false;
			   char temp = ans.charAt(ans.length()-1);
			   
			   if(ch=="}" && temp !='{')
				   return false;
			   else if(ch=="]" && temp !='[')
				   return false;
			   else if(ch==")" && temp !=')')
				   return false;
			   
			   ans.deleteCharAt(ans.length()-1);
			   return isB(ros, ans);
		}
		return isB(ros,ans);
	}

}
