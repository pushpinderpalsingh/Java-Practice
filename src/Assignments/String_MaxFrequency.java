package Assignments;

import java.util.Scanner;

public class String_MaxFrequency {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		str.append(scn.next());
		
		int max=0;
		char maxch=str.charAt(0);
		
		for(int i=0; i<str.length(); i++) {
			char check = str.charAt(i);
            int newmax=0;
            
			for(int j=i; j<str.length();j++) {
				if(check==str.charAt(j))
					newmax++;
			}
			if(newmax>max)
			{
				maxch=check;
				max=newmax;
			}
		}
		System.out.println(maxch);
	}

}
