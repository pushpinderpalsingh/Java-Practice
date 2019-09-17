package lecture7;

import java.util.Scanner;

public class InputDisplayJagged {

	public static void main(String[] args) {
		int[][] arr=TakeInput();
		display(arr);

	}
	public static int[][] TakeInput(){
	  
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=scn.nextInt();
		
		int [][] arr= new int [row][];
		
		for(int i=0;i<row;i++) {
		
			System.out.println("Enter the number of cols for " + i + " row");
		    int col=scn.nextInt();
		    arr[i]=new int [col];
		
		    for(int j=0; j<col; j++) {
			
		    	System.out.println("Enter the element for [" + i + "-"+ j + "]");
	            arr[i][j]=scn.nextInt();
			
		} 
		}
	  return arr;
	}
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
