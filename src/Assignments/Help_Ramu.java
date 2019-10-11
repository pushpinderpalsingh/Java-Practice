package Assignments;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int testcase=scn.nextInt();
        while(testcase>0) {
        	int c1=scn.nextInt();
        	int c2=scn.nextInt();
        	int c3=scn.nextInt();
        	int c4=scn.nextInt();
        	
        	int nr=scn.nextInt();
        	int nc=scn.nextInt();
        	
        	int[] rick = new int[nr];
        	int[] cab= new int[nc];
        	
        	for(int i=0; i<nr; i++)
        		rick[i]=scn.nextInt();
        	for(int i=0; i<nc; i++)
        		cab[i]=scn.nextInt();
        	
        	int cr= calculate(rick,c1,c2,c3);
        	int cc= calculate(cab,c1,c2,c3);
        	
        	System.out.println(Math.min(cr+cc, c4));
        	
        	testcase--;
        }

	}
	public static int calculate(int[] arr, int c1, int c2, int c3) {
		int fare=0;
		
		for(int i=0; i<arr.length; i++) {
			fare+=Math.min(c1*arr[i], c2);
		}
		return Math.min(fare,c3);
	}

}
