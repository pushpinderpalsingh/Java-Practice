package Assignments;

import java.util.Scanner;

public class ShoppingGame {
 static Scanner  scn = new Scanner(System.in);
  public static void main(String[] args) {
	  int test= scn.nextInt();
	  TestCase(test);
	  
  }
 
 public static void TestCase(int test)
 {
	
	 while(test>0)
	 { 
		 int M=scn.nextInt();
	     int N=scn.nextInt();
	     FindLarger(M,N);
		 test--;
	 }
 }
 public static void FindLarger(int M,int N) {
	int ap=0;
	int hp=0;
	int counter=1;
	while(true) {
		ap+=counter;
		counter++;
		hp+=counter;
		if(ap>M)
		{	System.out.println("Harshit");
		break;
		}
		else if(hp>N)
		{	System.out.println("Ayush");
		break;
		}
		counter++;
	}
 }
}
