package lecture28;

public class MazePath_DP {
	
	public static void main(String[] args) {
		System.out.println(mazePathD(0, 0,2, 2));
		System.out.println(mazePathTD(0, 0, 2, 2, new int[3][3]));
		System.out.println(mazePathBU(2, 2));
	}
	
	public static int mazePathD(int cr, int cc, int ec, int er) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
        int cnt = 0;
		cnt+=mazePathD(cr + 1, cc, ec, er);
		cnt+=mazePathD(cr, cc + 1, ec, er);
		return cnt;
	}
	public static int mazePathTD(int cr, int cc, int ec, int er, int[][] strg) {

		if (cr == er && cc == ec) {
			return 1;
		}

		if (cr > er || cc > ec) {
			return 0;
		}
		
		if(strg[cr][cc]!=0)
			return strg[cr][cc];
        int cnt = 0;
		cnt+=mazePathTD(cr + 1, cc, ec, er , strg);
		cnt+=mazePathTD(cr, cc + 1, ec, er , strg);
		
		strg[cr][cc] = cnt;
		
		return cnt;
	}
	public static int mazePathBU(int er, int ec) {
		int[][] strg = new int[er+2][ec+2];
		
		for(int i=er; i>=0; i--) {
			for(int j=ec; j>=0; j--) {
				if(j==ec && i==er)
					strg[i][j] = 1;
				
				strg[i][j]+= strg[i+1][j] + strg[i][j+1];
			}
		}
		return strg[0][0];
	}

}
