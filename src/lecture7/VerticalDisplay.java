package lecture7;

import java.util.Scanner;

public class VerticalDisplay {

	public static void main(String[] args) {
		int[][] arr=TakeInput();
		VerticalDisp(arr);

	}
	public static int[][] TakeInput() {
		int row=3;
		int col=2;
		int [][] arr= new int [row][col];
		Scanner scn=new Scanner(System.in);
		for(int r=0;r <row; r++) {
			for(int c=0; c<col; c++) {
			   arr[r][c]=scn.nextInt();
			}
		}
		return arr;
	}
	public static void VerticalDisp(int[][] arr) {
		for(int r=0; r<arr[0].length;r++) {
			for(int col=0;col<arr.length;col++) {
				System.out.print(arr[col][r]+" ");
			}
			System.out.println();
		}
	}

}
