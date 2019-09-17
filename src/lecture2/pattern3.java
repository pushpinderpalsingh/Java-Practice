package lecture2;

public class pattern3 {

	public static void main(String[] args) {
		int n=10;
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
			{
				System.out.print("*");
				cst++;
			}
		System.out.println();
			row++;
		     nst--;
		     nsp+=2;
		}

	}

}
