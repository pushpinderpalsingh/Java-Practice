package lecture5;

public class NextPermutation {

	public static void main(String[] args) {
       int a= NextPerm(98745);
       System.out.println(a);
	}
	 
	public static int NextPerm(int n) {
	boolean ans=false;
	int counter=1;
	int val=1;
		for(int i=n+1; ;i++)
		{ int temp=n;
			while(temp>0)
			{
				int digit=temp%10;
				ans=haveDigits(digit,i);
				temp/=10;
				counter++;
				if(ans==true)
				   val++;
			}
			if(val==counter)
				return i;
			
		}
//		return ;
	}
	public static boolean haveDigits(int digit,int number) {
			while(number>0) {
			int digitcheck=number%10;
			 if(digitcheck==digit)
			 {
				 return true;
			 }
			number/=10;
		}
		return false;
	}

}
