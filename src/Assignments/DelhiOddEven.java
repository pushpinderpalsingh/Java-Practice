package Assignments;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int counter= scn.nextInt();
		while(counter>0)
		{   int anse=0;
		    int anso=0;
			int number=scn.nextInt();
			while(number>0)
			{
				int rem=number%10;
				if(rem%2==0)
				   anse+=rem;
				else
					anso+=rem;
				number/=10;
				
			}
			if(anse%4==0 || anso%3==0)
				System.out.println("\nYes");
			else System.out.println("No");
			counter--;
		}
	}

}
