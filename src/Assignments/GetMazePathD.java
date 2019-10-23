package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int er = scn.nextInt();
		int ec = scn.nextInt();
        ArrayList<String> ans = mp(1, 1, er, ec);
        for(String val : ans)
        	System.out.print(val+" ");
        System.out.println();
        System.out.println(ans.size());
	}
	public static ArrayList<String> mp (int cr, int cc , int er, int ec){
		if(cr==er && cc == ec) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add(" ");
			return bc;
		}
		if(cr>er || cc > ec) {
			ArrayList<String> bc = new ArrayList<String>();
			return bc;
		}
		ArrayList<String> rr = mp(cr+1, cc, er, ec);
		ArrayList<String> mr = new ArrayList<String>();
		for(String rs : rr)
			mr.add("V" + rs);
		rr = mp(cr, cc+1 , er, ec);

		for(String rs : rr)
			mr.add("H" +rs);
		if(cr==cc) {
		rr = mp(cr+1, cc+1, er, ec);
		
		for(String rs : rr)
			mr.add("D"+rs);
		}
		return mr;
	} 

}
