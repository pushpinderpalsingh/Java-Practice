package Assignments;

import java.util.Scanner;

public class AggressiveCows {
static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
    int n = scn.nextInt();
    int c = scn.nextInt();
	int [] arr = TakeInput(n);
     arr =  InsertionSort(arr);
     int a = ac(arr);
     System.out.println(a);
	}
	public static int ac(int[] arr) {
		int min = 9999;
		for(int i=0;i<arr.length-1;i++) {
		  int temp=arr[i]-arr[i+1]-1;
		  if(min>temp)
			  min=temp;
		}
		return min;
	}
	
	public static int[] InsertionSort(int[] arr) {
		
		for(int cnt=1; cnt<arr.length;cnt++) {
			int temp = arr[cnt];
			int j=cnt-1;
			while(j>=0 && arr[j]<temp) {
				arr[j+1]=arr[j];
				j--;
			}
		}
		return arr;
	}
	public static int[] TakeInput(int r) {
	int [] arr= new int [r];

	for(int i=0;i<r; i++) {
	 arr[i] = scn.nextInt();
	}
	return arr;
}

}
