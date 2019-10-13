package Assignments;

import java.util.Scanner;

public class String_CompressString {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		str.append(scn.next());
		int newmax=0;
		
		for(int i=0; i<str.length(); i+=newmax) {
			char check = str.charAt(i);
            newmax=0;
    
			for(int j=i; j<str.length() && check==str.charAt(j);j++) {
					newmax++;
			}
			System.out.print(check);
            if(newmax==1)
            	continue;
			System.out.print(newmax);
		}
	}

}
