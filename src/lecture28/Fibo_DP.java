package lecture28;

public class Fibo_DP {

	public static void main(String[] args) {
		System.out.println(fibbu(6));
		System.out.println(fibtd(6, new int [7]));
		System.out.println(fibbuse(6));
	}
	
	public static int fib(int n) {
		
		if(n==0 || n==1)
			return n;
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1+f2;
	}
	
	public static int fibtd(int n , int[] strg) {
		if(n==0 || n==1)
			return n;
		
		if(strg[n]!=0)
			return strg[n];
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		strg[n] = f1+f2;
		return strg[n];
	}
	
	public static int fibbu(int n) {
		int[] strg = new int [n+1];
		
		strg[0] = 0;
		strg[1] = 1;
		
		for(int i=2; i<n+1; i++) {
			
			strg[i] = strg[i-1] + strg[i-2];
			
		}
		return strg[n];
	}
	
	public static int fibbuse(int n) {
	int[] strg = new int [2];
		
		strg[0] = 0;
		strg[1] = 1;
		
		for(int i=2; i<n+1; i++) {
			
			int sum = strg[0] + strg[1];
			
			strg[0] = strg[1];
			strg[1] = sum;
			
		}
		return strg[1];
	}
	
}
