package Assignments;

import java.util.Scanner;

import lecture16.stack;
import lecture18.DynamicStack;

public class PlayingWithCards {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int iter = scn.nextInt();
		stack A = new DynamicStack();
		int cnt=1;
		
		while(num>0) {
			A.push(scn.nextInt());
			num--;
		}
		
		while(cnt<=iter) {
			A = playcard(A,primeno(cnt));
			cnt++;
		}
		A.Display();
	}
	
	public static stack playcard(stack A , int prime) throws Exception {
		stack B = new DynamicStack();
		stack A1 = new DynamicStack();
		
		while(!A.isEmpty()){
			if(A.peek()%prime == 0) {
				B .push(A.pop());
			}
			A1.push(A.pop());
		}
		
		B.Display();
		return A1;
	}
	
	public static int primeno(int it) {
       int cnt =0;
       int i=0;
		for (i = 2; true ; i++) {
				if (isPrime(i) == true)
                       cn
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
