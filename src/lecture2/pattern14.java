package lecture2;

public class pattern14 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int nst=n;
		int nsp=n-1;
		while(row<=2*n-1)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
		System.out.println();
		

     if(row<n)
     {
    	 nst--;
    	 nsp--;
     }
     else {
    	 nst++;
    	 nsp++; 
     }
 	row++;
		}

	}



}