package lecture7;

import java.util.Scanner;

public class PalindromeSubstring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str=scn.next();
		System.out.println(substring(str));
		scn.close();
	}
	public static int substring(String str) {
		int count=0;
		for(int j=0; j<str.length();j++) {
		for(int i=j+1;i<=str.length();i++) {
			if(stringcheck(str.substring(j,i))==true)
				count++;
		}	    
		}
		return count;
	}
	public static boolean stringcheck(String str) {
		int i=0;
       while(i<str.length()) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				return false;
			}
			i++;
		}
		return true;
	}

}
