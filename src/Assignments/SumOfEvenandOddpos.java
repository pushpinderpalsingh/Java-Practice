package Assignments;

import java.util.Scanner;

public class SumOfEvenandOddpos {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num= scn.nextInt();
		int anse=0;
		int anso=0;
		int pos=0;
		while(num>0)
		{
			int rem=num%10;
			if(pos%2==0)
				anse+=rem;
			else anso+=rem;
			num/=10;
			pos++;
		}
		
		System.out.println(anse);
		System.out.println(anso);

	}

}
