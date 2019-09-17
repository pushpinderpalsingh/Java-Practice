package lecture2;

public class pattern15 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{ if(cst==1 || cst==nst )
				System.out.print("*");
			else System.out.print(" ");
				cst++;
			}
		System.out.println();
		

     if(row<n-2)
     {
    	 nsp++;
    	 nst-=2;
     }
     else {
    	 nsp--;
    	 nst+=2; 
     }
 	row++;
		}

	}



}