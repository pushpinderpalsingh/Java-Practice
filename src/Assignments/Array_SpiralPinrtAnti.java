package Assignments;

import java.util.Scanner;

public class Array_SpiralPinrtAnti {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr= TakeInput();
        anticlkspiraldisp(arr);
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
	public static void anticlkspiraldisp(int[][] arr) {
		int count= arr.length*arr[0].length;
		int cnt=0;
		int MinRow=0;
		int MinCol=0;
		int MaxRow=arr.length-1;
		int MaxCol=arr[0].length-1;
		while(cnt<count) {
			int i=MinRow;
			while(i<=MaxRow && cnt<count) {
				System.out.print(arr[i][MinCol]+", ");
				cnt++;
				i++;
			}
			MinCol++;
			
			i=MinCol;
			while(i<=MaxCol && cnt<count) {
				System.out.print(arr[MaxRow][i]+", ");
				cnt++;
				i++;
			}
			MaxRow--;
			i=MaxRow;
			while(i>=MinRow && cnt<count) {
				System.out.print(arr[i][MaxCol]+", ");
				i--;
				cnt++;
			}
			MaxCol--;
			i=MaxCol;
			while(i>=MinCol && cnt<count) {
				System.out.print(arr[MinRow][i]+", ");
				i--;
				cnt++;
			}
			MinRow++;
			
		}
	}

}
