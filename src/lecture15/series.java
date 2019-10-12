package lecture15;

public class series {
     public static void main(String[] args) {
    	 int n=1;
    	 int x=3;
    	 int power=(int)Math.pow(x, n);
    	 int sum=0;
    	 for(int i=1;i<=n;i++) {
    		 sum+=i*power;
    		 power/=x;
    	 }
    	 System.out.println(sum);
     }
}
