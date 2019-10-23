package Assignments;

import java.util.ArrayList;
import java.util.Scanner;


public class BoardPathHack {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
	    int num = scn.nextInt();
	    int dicenum = scn.nextInt();
	    
	    ArrayList<String> ans = bp(0, num, dicenum);
	    
	    for(String val : ans)
	    	System.out.print(val+" ");
	    System.out.println();
	    System.out.println(bpcn(0, num , dicenum));
	}
	
	
	public static ArrayList<String> bp (int current , int end , int dicenum){
		if(current==end) {
			ArrayList<String> bc = new ArrayList<String>();
			bc.add(" ");
			return bc;
		}
		if(current>end) {
			ArrayList<String> bc = new ArrayList<String>();
			return bc;
		}
		ArrayList<String> mr = new ArrayList<String>();
		for(int dice=1; dice <= dicenum ; dice++) {
			ArrayList<String> rr = bp(current + dice, end, dicenum);
			
			for(String str : rr) {
				mr.add(dice+str);
			}
		}
		return mr;
	}
	public static int bpcn (int current , int end , int dicenum){
		if(current==end) {
			return 1;
		}
		if(current>end) {
			return 0;
		}
		int mr=0;
		for(int dice=1; dice <= dicenum ; dice++) {
			int rr = bpcn(current + dice, end, dicenum);
			mr+=rr;
		}
		return mr;
	}

}
