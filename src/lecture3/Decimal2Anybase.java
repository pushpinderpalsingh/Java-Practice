package lecture3;

import java.util.Scanner;

public class Decimal2Anybase {

	public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        
		int n= scn.nextInt();
         int mult=1;
         int ans=0;
         int base=scn.nextInt();
          while(n>0)
          {
        	  int rem=n%base;
        	  ans=ans+ rem*mult;
        	  mult=mult*10;
        	  n=n/base;
          }
      System.out.println(ans);
	}

}
