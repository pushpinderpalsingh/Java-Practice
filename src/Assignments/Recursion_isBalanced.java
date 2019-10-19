package Assignments;

public class Recursion_isBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isb(StringBuilder str, StringBuilder ans) {
		
		
		String ch = str.substring(0,1);
		String ros = str.substring(1);
		
		if(ch=="{" || ch=="[" || ch == "(") {
			ans.append(ch);
			return isb(ros);
		} 
	}

}
