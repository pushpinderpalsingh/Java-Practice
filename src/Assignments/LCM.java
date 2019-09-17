package Assignments;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		  Scanner scn= new Scanner(System.in);
          int N1= scn.nextInt();
          int N2 = scn.nextInt();
          int GCD=0;
          int counter=1;
          while(counter<=N1 || counter<=N2) {
        	  if(N1%counter==0&&N2%counter==0) {
        		  GCD=counter;
        	  }
        	  counter++;
          }
          int LCM=(N1*N2)/GCD;
          System.out.println(LCM);
	}

}
