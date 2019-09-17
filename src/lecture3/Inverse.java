package lecture3;

//import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		int  num=213;
		int temp=num;
		int multi=1;
		int pos=0;
		int digit;
		while(num>0) {
			num=num/10;
			pos++;
		}
		num=0;
		
		while(pos>0) {
			int p=(int)Math.pow(10, pos-1);
			digit=temp/p;
			num=num+digit*multi;
			 multi=multi*10;
			 pos--;
		}
//      for(int i=1;i<=pos;i++) {
//    	  
//    	 
//      }
      System.out.println(num);
	}

}
