package Assignments;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if(Character.isUpperCase(ch)==true)
			System.out.println("UPPERCASE");
		else if(Character.isLowerCase(ch)==true)
			System.out.println("lowercase");
		else 
			System.out.println("Invalid");

	}

}
