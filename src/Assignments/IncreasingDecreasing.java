package Assignments;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int N = scn.nextInt();
		int i=1;
		int Prev=scn.nextInt();
	    boolean isinc= false;
	    boolean ans=true;
	   		while(i<N) {
			int current= scn.nextInt();
			if(Prev < current)
				isinc=true;			
		    if(Prev > current && isinc==true )
			{	ans=false;
			    break;
			}
			if(Prev==current)
				{   ans=false;
				break;
				}
			Prev=current;
			
			i++;
		}
	   		System.out.println(ans);

	}

}
