package Assignments;

public class PatternTA {

	public static void main(String[] args) {
	int n=4;
	int row=1;
	int nst=2*n-1;
	int val= 2*n-1;
	int counter=0;
	while(row<=2*n-1) {
		int cst=1;
		int cnt=counter;
		while(cst<=nst) {
			
			System.out.print(val+" ");
			cst++;
			if(cnt>0) {
				val-=cnt;
				cnt--;
			}
		}
		System.out.println();
		row++;
		counter++;
	}

	}

}
