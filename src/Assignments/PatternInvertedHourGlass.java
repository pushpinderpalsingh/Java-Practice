package Assignments;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		int n=6;
		int row=1;
		int nst=1;
		int nsp=2*n-1;
		int count=0;
		while(row<=2*n+1) {
			int cst=1;
			int val=n;
			while(cst<=nst) {
				System.out.print(val+ " ");
				cst++;
				val--;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			cst=1;
			val=n-count;
		   if(row==n+1)
		   {   cst++; val++;  }
			while(cst<=nst) {
				System.out.print(val+" ");
				val++;
				cst++;
			}
			System.out.println();
			if(row<n+1) {
				nsp-=2;
				nst++;
				count++;
			}
			else 
			{
				count--;
				nsp+=2;
				nst--;
			}
			row++;
			
				}

	}

}
