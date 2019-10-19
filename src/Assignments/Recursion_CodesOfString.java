package Assignments;

import java.util.ArrayList;
import java.util.Scanner;


public class Recursion_CodesOfString {

	public static void main(String[] args) {
      
		Scanner scn = new Scanner(System.in);
		System.out.println(generate(scn.next()));

	}
	
    public static ArrayList<String> generate(String str){
    	
    	if(str.length()==0)
    	{
    		ArrayList<String> br = new ArrayList<String>();
    		br.add("");
    		return br;
    	}
    	
    	String ch1 = str.substring(0,1);
    	String ros = str.substring(1);
    	
    	ArrayList<String> rr = generate(ros);
    	ArrayList<String> mr = new ArrayList<String>();
    	
    	int chnum = Integer.parseInt(ch1);
    	
    	char temp =(char)('a' + chnum - 1);
    	
    	for(String val : rr)
    		mr.add(temp + val);
    	
    	if(str.length()>=2) {
    		String ch2 = str.substring(0,2);
    		String ros2 = str.substring(2);
    		
    		int num2 = Integer.parseInt(ch2);
    		
    	     if(num2<=26) {	
    		char temp1 = (char)('a' + num2 -1);
    		  ArrayList<String> rr2 = generate(ros2);
    		  
    		 for(String val : rr2){
    			 mr.add(temp1 + val);
    		 }
    	     }
    		
    	}
    	
    	return mr;
    	
    }
}
