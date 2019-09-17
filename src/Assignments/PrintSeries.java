package Assignments;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
          
		 Scanner scn= new Scanner(System.in);
		 int N1 = scn.nextInt();
		 int N2 = scn.nextInt();
		 int counter=1;
		 int val=1;
		 int n=1;
		 while(counter<=N1)
		 {    val=3*n + 2;
			 if(val%4!=0)
			 {
				 System.out.println(val);
				 counter++;
			 }
			 n++;
		 }

	}

}
