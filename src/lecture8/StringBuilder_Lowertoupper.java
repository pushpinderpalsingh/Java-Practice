package lecture8;

import java.util.Scanner;

public class StringBuilder_Lowertoupper {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		str=ToggleCase(str);
		System.out.println(str);

	}
	public static String ToggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
	    for(int i=0; i<str.length();i++) {
	    	if(Character.isLowerCase(sb.charAt(i))) 
	    		sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
	    	else
	    		sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
	    }
	    str=sb.toString();
	    return str;
	}

}
