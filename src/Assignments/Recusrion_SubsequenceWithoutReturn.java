package Assignments;

import java.util.Scanner;

public class Recusrion_SubsequenceWithoutReturn {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int i = subseq(scn.next(), new String(),0);
		
		System.out.println();
		System.out.println(i);

	}
	public static int subseq(String ques, String ans, int cnt) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		int an = subseq(ros, ans , cnt+1);
		an+=subseq(ros, ans + ch , cnt+1);
        return an;
	}

}
