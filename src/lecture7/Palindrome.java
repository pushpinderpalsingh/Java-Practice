package lecture7;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str=scn.next();
		System.out.println(stringcheck(str));
		scn.close();
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
