package Assignments;

import java.util.Scanner;

public class Array_WaveColumn {
    static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	   int[][] arr = TakeInput();
	   WaveCol(arr);
	   System.out.print("END");

	}
	public static int[][] TakeInput() {
		int row=scn.nextInt();
		int col=scn.nextInt();
		int [][] arr= new int [row][col];
		for(int r=0;r <row; r++) {
			for(int c=0; c<col; c++) {
			   arr[r][c]=scn.nextInt();
			}
		}
		return arr;
	}
	public static void WaveCol(int[][] arr) {
		int flag=0;
		int col=0;
		int counter=arr.length*arr[0].length;
		int cnt=1;
		while(cnt<=counter) {
		if(flag==0) {
			for(int i=0;i<arr.length && cnt<=counter;i++) {
				System.out.print(arr[i][col]+", ");
				cnt++;
			}
			flag++;
			col++;
		}
		else if(flag==1) {
			   for(int i=arr.length-1;i>=0&&cnt<=counter;i--) {
				   System.out.print(arr[i][col]+", ");
				   cnt++;
			   }
			flag--;
			col++; }
		}
	}

}
