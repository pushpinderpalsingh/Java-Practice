package lecture3;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter no. of rotation");
		int nor = scn.nextInt();
		System.out.println("Enter number");
		int n = scn.nextInt();
		int no;
		
		while (nor > 0) {
			no = n % 10;
			n = n / 10;
			int temp = n;
			int count = 0;
			int mult = 1;
			
			while (temp > 0) {
				temp = temp / 10;
				count++;
			}
//			nor=nor%count;
			while (count > 0) {
				mult = mult * 10;
				count--;
			}
			n = n + no * mult;
			nor--;
		}
		System.out.println(n);
	}

}
