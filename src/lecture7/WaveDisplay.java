package lecture7;

import java.util.Scanner;

public class WaveDisplay {

	public static void main(String[] args) {
		int[][] arr=TakeInput();
		WaveDisp(arr);
        System.out.print(" END");
	}
	public static int[][] TakeInput() {
			Scanner scn=new Scanner(System.in);
			int row=scn.nextInt();
		int col=scn.nextInt();
		int [][] arr= new int [row][col];
	
		for(int r=0;r<row; r++) {
			for(int c=0; c<col; c++) {
			   arr[r][c]=scn.nextInt();
			}
		}
		return arr;
	}
	public static void WaveDisp(int [][] arr) {
		int count=0;
		for(int r=0; r<arr.length;r++) {
			if(count==0) {
			for(int col=0;col<arr[r].length;col++) {
				System.out.print(" "+arr[col][r]+ ",");
			} count++;}
			else if(count==1) {
				for(int col=arr[r].length-1;col>=0;col--) {
					System.out.print(" "+arr[col][r]+ ",");
				} count--;
			}
		}
	}
}
