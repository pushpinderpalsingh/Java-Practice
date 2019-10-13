package Assignments;

import java.util.Scanner;

public class Strings_OddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(scn.next());
		for(int i=0; i<str.length();i++)
		{
			int a = str.charAt(i);
			if(i%2==0) {
				a++;
			}
			else 
			{
				a--;
			}
			str.setCharAt(i,(char)a);
		}
		System.out.println(str);
	}

}
