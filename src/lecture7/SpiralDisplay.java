package lecture7;

import java.util.Scanner;

public class SpiralDisplay {	
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = TakeInput();
		Spiral(arr);
		System.out.print(" END");
		
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
	public static void Spiral(int[][] arr) {
		int check= arr.length*arr[0].length;
		int counter=1;
		int minrow=0;
		int mincol=0;
		int maxrow=arr.length-1;
		int maxcol=arr[0].length-1;
		while(counter<=check) {
			int i=minrow;
		    while(i<=maxrow && counter<=check) {
		    	System.out.print(" "+ arr[i][mincol]+",");
		    	counter++;
		    
		    	i++;
		    }	mincol++;
		    i=mincol;
		    while(i<=maxcol && counter<=check) {
		    	System.out.print(" "+ arr[maxrow][i]+",");
		    	counter++;
		    
		    	i++;
		    }	maxrow--;
		    i=maxrow;
		    while(i>=minrow && counter<=check) {
		    	System.out.print(" "+ arr[i][maxcol]+",");
		    	counter++;
		  
		    	i--;
		    }  	maxcol--;
		    i=maxcol;
		    while(i>=maxcol && counter<=check) {
		    	System.out.print(" "+ arr[minrow][i]+",");
		    	counter++;
		    	i--;
		    } minrow++;
		}
		
	}
}
