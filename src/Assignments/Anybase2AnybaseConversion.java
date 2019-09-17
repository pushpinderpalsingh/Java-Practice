package Assignments;

import java.util.Scanner;

public class Anybase2AnybaseConversion {

	public static void main(String[] args) {
	   Scanner scn = new Scanner(System.in);
	   int sb = scn.nextInt();
	   int db = scn.nextInt();
	   int sn = scn.nextInt();
	   int ans=0;
	   int mult=1;
       if(sb!=10 && db!=10) {
    	   while(sn>0)
           {
         	  int rem=sn%10;
         	  ans=ans+ rem*mult;
         	  mult=mult*sb;
         	  sn=sn/10;
           }
    	   sn=ans;
    	   ans=0;
    	   mult=1;
    	   while(sn>0)
           {
         	  int rem=sn%db;
         	  ans=ans+ rem*mult;
         	  mult=mult*10;
         	  sn=sn/db;
           }
       }
       System.out.println(ans);
	}

}
