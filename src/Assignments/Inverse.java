package Assignments;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int pos=1;
		int ans=0;
		int num = scn.nextInt();
		while(num>0)
		{
			int rem = num%10;
			ans = ans + pos * (int) Math.pow(10, rem - 1);
			pos++;
			num=num/10;
		}
		System.out.println(ans);
	}

}
