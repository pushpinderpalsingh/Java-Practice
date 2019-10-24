package Assignments;

import java.util.Scanner;
import java.util.Stack;



public class PlayingWithCards {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int iter = scn.nextInt();
		Stack<Integer> A = new Stack<>();
		int cnt=1;
		
		while(num>0) {
			A.push(scn.nextInt());
			num--;
		}
		
		while(cnt<=iter) {
			A = playcard(A,primeno(cnt));
			cnt++;
		}
		for(int val : A)
			System.out.print(val+" ");
	}
	
	public static Stack<Integer> playcard(Stack<Integer> A , int prime) throws Exception {
		Stack<Integer> B = new Stack<>();
		Stack<Integer> A1 = new Stack<>();
		
		while(!A.isEmpty()){
			if(A.peek()%prime == 0) {
				B . push(A.pop());
			}
			else
		     A1.push(A.pop());
		}
		
		for(int val : B)
			System.out.print(val+" ");
		return A1;
	}
	
	public static int primeno(int it) {
       int cnt =0;
       int i=0;
		for (i = 2; true ; i++) {
				if (isPrime(i) == true)
                       cnt++;
				if(cnt==it)
					return i;
			}
		}

		public static boolean isPrime(int n) {
			int i = 2;
			while (i < n) {
				if (n % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}

}
