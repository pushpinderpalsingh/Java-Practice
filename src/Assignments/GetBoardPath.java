package Assignments;

import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(gbp(0, 10));
	}
	
	public static ArrayList<String> gbp(int current, int end){
		if(current==end) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add("");
			return bc;
		}
		if(current>end) {
			ArrayList<String> bc = new ArrayList<String>();
			return bc;
		}
		
		ArrayList<String> mr = new ArrayList<String>();
		for(int dice=1;dice<=6; dice++) {
			ArrayList<String> rr = gbp(current+dice,end);
			for(String cs : rr) {
				mr.add(dice + cs);
			}
		}
		return mr;
	}

}
