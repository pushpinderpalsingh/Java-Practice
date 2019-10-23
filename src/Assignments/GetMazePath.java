package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int er = scn.nextInt();
		int ec = scn.nextInt();
        System.out.println(mp(0, 0, er, ec));
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
		
		return mr;
	} 

}
