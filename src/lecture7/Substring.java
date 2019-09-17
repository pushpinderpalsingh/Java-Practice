package lecture7;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str=scn.next();
		substring(str);
		scn.close();
	}
	public static void substring(String str) {
		for(int j=0; j<str.length();j++) {
		for(int i=j+1;i<=str.length();i++) {
			System.out.println(str.substring(j,i));
		} }
	}

}
