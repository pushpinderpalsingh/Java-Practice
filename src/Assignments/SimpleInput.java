package Assignments;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int ans=0
		while(ans>=0)
		{
			int num=scn.nextInt();
			 if(ans<0)
				 break;
			System.out.println(num);
	         ans+=num;
			
		}

	}

}
