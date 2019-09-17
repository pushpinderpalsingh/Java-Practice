package lecture3;

public class Anybase2Decimal {

	public static void main(String[] args) {
          int n=1001;
          int mult=1;
         int ans=0;
         int base=2;
          while(n>0)
          {
        	  int rem=n%10;
        	  ans=ans+ rem*mult;
        	  mult=mult*base;
        	  n=n/10;
          }
      System.out.println(ans);
	}

}
