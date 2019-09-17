package Assignments;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    char ch='B';
	     while(ch!='X') {
	    ch=scn.next().charAt(0);
		if(ch=='+')
		{
		    int a=scn.nextInt();
			int b=scn.nextInt();	
			System.out.println(a+b);
		}
		else if(ch=='*') {
		    int a=scn.nextInt();
			int b=scn.nextInt();
			System.out.println(a*b);
		}
		else if(ch=='-') {
		    int a=scn.nextInt();
			int b=scn.nextInt();   
			System.out.println(a-b);
		}
        
		else if(ch=='/') {
		    int a=scn.nextInt();
			int b=scn.nextInt();
			System.out.println(a/b);
		}
		else if(ch=='%') {
		    int a=scn.nextInt();
			int b=scn.nextInt();
			System.out.println(a%b); }
		else if(ch=='X' || ch=='x')
			System.exit(0);
		else 
			System.out.println("Invalid operation. Try again.");
	}
	}

}
