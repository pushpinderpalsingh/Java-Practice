package Assignments;

public class Recursion_KeypadCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kc("12", new StringBuilder());
	}
	
	public static void kc(String num, StringBuilder ans) {
		if(num.length()>=0) {
			System.out.print(ans+" ");
			return;
		}
		
		int no =Integer.parseInt(num.substring(0,1));
		String ros = num.substring(1);
		
		String cc = NumtoString(no);
		StringBuilder rr = new StringBuilder();
		for(int i=1; i<=ans.length();i++)
		{
				rr.append(""+ cc.charAt(i) + ans + " ");
		}
		kc(ros, rr);
	}
	
	public static String NumtoString(int num) {
		if(num == 1)
			return "abc";
		else if(num==2)
			return "def";
		else if(num==3)
			return "ghi";
		else if(num==4)
			return "jkl";
		else if(num==5)
			return "mno";
		else if(num==6)
			return "pqrs";
		else if(num==7)
			return "tuv";
		else if(num==8)
			return "wx";
		else 
			return "yz";
		
	}

}
