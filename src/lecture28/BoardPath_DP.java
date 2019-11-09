package lecture28;

public class BoardPath_DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(boardPath(0,10));
        System.out.println(boardPathTD(0, 10, new int[11]));
        System.out.println(boardPathBU(0, 10));
        System.out.println(boardPathBUSE(0, 10));
	}
	public static int boardPath(int curr, int end) {

		if (curr == end) {
			return 1;
		}
		int cnt =0;
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			cnt+=boardPath(curr + dice, end);
		}
        return cnt;
	}
	public static int boardPathTD(int curr, int end, int[] strg) {
		if (curr == end) {
			return 1;
		}
		int cnt =0;
		
		if(strg[curr] !=0)
			return strg[curr];
		for (int dice = 1; dice <= 6 && curr + dice <= end; dice++) {

			cnt+=boardPathTD(curr + dice, end, strg);
		}
		
		strg[curr] = cnt;
        return cnt;
	}
	
	public static int boardPathBU(int curr, int end) {
		int[] strg = new int [end + 6];
		strg[end] = 1;
		
		for(int i=end-1; i >= 0; i--) {
			for(int dice=1;dice<=6;dice++) {
				strg[i]+= strg[i+dice];
			}
		}
		return strg[0];
	}
	public static int boardPathBUSE(int curr, int end) {
		int[] strg = new int [6];
		strg[0] = 1;
		
		for(int i=0; i < end; i++) {
			
			int sum =0;
			for(int j=0; j <6 ; j++)
				sum+=strg[j];
			
			strg[5] = strg[4];
			strg[4] = strg[3];
			strg[3] = strg[2];
			strg[2] = strg[1];
			strg[1] = strg[0];
			strg[0] = sum;
		}
		return strg[0];
	}
	

}
