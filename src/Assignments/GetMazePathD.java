package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int er = scn.nextInt();
		int ec = scn.nextInt();
        int ans = mp(1, 1, er, ec, new String());
        System.out.println();
        System.out.println(ans);
	}
	public static int mp (int cr, int cc , int er, int ec , String ans){
		if(cr==er && cc == ec) {
			System.out.print(ans+" ");
			return 1;
		}
		if(cr>er || cc > ec) {
			return 0;
		}
		int mr=0;
		int rr = mp(cr+1, cc, er, ec, "V"+ans);
		mr+=rr;
		rr = mp(cr, cc+1 , er, ec, "H"+ans);
        mr+=rr;
		if(cr==cc) {
		rr = mp(cr+1, cc+1, er, ec, "D" +ans);
		mr+=rr;
		}
		return mr;
	} 

}
