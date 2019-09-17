package Assignments;

import java.util.Scanner;

public class ChewbaccaNumber {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int counter=1;
		int num=scn.nextInt();
		int temp=num;
		while(temp>0) {
			int digit=temp%10;
			if(9-digit<digit)
			{
			    num=num-(9*(int)Math.pow(10, counter));
			    
			}
			temp=temp/(int)Math.pow(10,counter);
			counter++;
		}
		System.out.println(num);
	}

}
