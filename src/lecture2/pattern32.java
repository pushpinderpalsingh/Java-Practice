package lecture2;

public class pattern32 {

	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int nst = 1;
		int val = 1;
		while (row <= 2 * n - 1) {
			int cst = 1;
			while (cst <= nst) {
				if (cst % 2 == 0)
					System.out.print("*");
				else
					System.out.print(val);
				cst++;

			}
			System.out.println();
//		if(row<n)
//			
//			else 

			if (row < n) {
				val++;
				nst += 2;
			} else {
				nst -= 2;
				val--;
			}
			row++;
		}

	}

}