package lecture2;

public class pattern33 {

	public static void main(String[] args) {
		int n=10;
		int row=1;
		int nst=1;
		int nsp=n-1;
		int val=n-1;
		while(row<=n)
		{
			int csp=1;
			while(csp<=nsp)
			{   
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			val=n-nst/2;
			while(cst<=nst)
			{  
				if(cst==(nst+1)/2)
				System.out.print("0");
			else System.out.print(val);
				cst++;
			if(cst>(nst+1)/2)
				val--;
			else
			val++;
			}
		System.out.println();
			row++;
		     nsp--;
		     nst+=2;
		}

	}



}