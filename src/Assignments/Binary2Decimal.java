package Assignments;

import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		  Scanner scn= new Scanner(System.in);
		  int num=scn.nextInt();
		  int mult=1;
		  int ans=0;
		   while(num>0)
		   {   int rem= num%10;
		       ans=ans+rem*mult;
		       mult=mult*2;
			   num/=10;	   }
		   System.out.println(ans);

	}

}
