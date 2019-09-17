package Assignments;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
	  Scanner scn =  new Scanner(System.in);
	  int num=scn.nextInt();
	  int check=scn.nextInt();
	  int counter=0;
	   
	  while(num>0)
	  {
		  int digit=num%10;
		  if(digit==check)
			  counter++;
		  num=num/10;
	  }
      System.out.println(counter);
	}

}
