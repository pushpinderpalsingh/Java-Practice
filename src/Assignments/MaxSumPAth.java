package Assignments;

import java.util.Scanner;

public class MaxSumPAth {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int t=scn.nextInt();
		
		while(t>0) {
			int no1=scn.nextInt();
			int no2 = scn.nextInt();
			int[] arr1 = new int[no1];
			int[] arr2  = new int [no2];
			
			for(int i=0; i<arr1.length; i++)
				arr1[i]=scn.nextInt();
			for(int i=0; i<arr2.length; i++)
				arr2[i]=scn.nextInt();
			int sum = checkmax(arr1,arr2);
			System.out.println(sum);
			t--;
		}
	}
	public static int checkmax(int[] one, int[] two) {
		int sum1=0;
		int sum2=0;
		int i=0;
		int j=0;
		int res=0;
		while(i<one.length && j<two.length) {
			if(one[i]<two[j]) {
				sum1+=one[i];
				i++;
			}else if(one[i]>two[j]) {
				sum2+=two[j];
				j++;
			}
			else {
				res+= Math.max(sum1, sum2) + one[i];
				sum1=0;
				sum2=0;
				i++;
				j++;
			}
			
		}
		while(i<one.length) {
			sum1+=one[i];
			i++;
		}
		while(j<two.length) {
			sum2+=two[j];
			j++;
		}
		res+=Math.max(sum1, sum2);
		return res;
	}

}
