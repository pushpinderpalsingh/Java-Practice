package Assignments;

import java.util.Scanner;

public class Decimal2Octal {
  public static void main(String[] args) {
	  Scanner scn= new Scanner(System.in);
	  int num=scn.nextInt();
	  int mult=1;
	  int ans=0;
	   while(num>0)
	   {   int rem= num%8;
	       ans=ans+rem*mult;
	       mult=mult*10;
		   num/=8;	   }
	   System.out.println(ans);
  }
}
