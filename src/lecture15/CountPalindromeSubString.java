package lecture15;

public class CountPalindromeSubString {

	public static void main(String[] args) {
		System.out.println(Countpal("wow"));
	}
	public static int Countpal(String str) {
	  int totcnt=0;
		for(int i=0;i<str.length();i++) {
		  int cnt1=grow(str, i,i);
		  int cnt2=grow(str,i,i+1);
		  totcnt+=cnt1+cnt2;
	  }
		return totcnt;
	}
	public static int grow(String str, int si, int ei) {
		int cnt=0;
		while(si>=0 && ei<str.length() && str.charAt(si)==str.charAt(ei)) {
			cnt++;
			si--;
			ei++;
		}
		return cnt;
	}

}
