package Assignments;

import java.util.Scanner;

public class Farenhiet2Celsuis {
 static Scanner scn= new Scanner(System.in);
 public static void main(String[] args)
 {
	 F2C();
 }
 public static void F2C()
   {
	   int MinF=scn.nextInt();
	   int MaxF=scn.nextInt();
	   int step=scn.nextInt();
	    for(int i=MinF;i<=MaxF;i+=step) {
	    	int C=(5*(i-32))/9;
	    	System.out.print(i+" ");
	    	System.out.println(C);
	    }
   }
}
