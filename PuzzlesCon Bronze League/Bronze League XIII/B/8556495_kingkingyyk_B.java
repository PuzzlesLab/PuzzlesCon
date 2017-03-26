import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
	
	public static StringBuilder sb;
	public static int solutionCount=0;
	
	public static void fillBoard(int [][] board, int row, int col) {
		//row
		for (int i=0;i<board.length;i++) board[i][col]++;
		//col
		for (int i=0;i<board.length;i++) board[row][i]++;
		//diagonals
		for (int i=1;i<board.length;i++) {
			//left top
			if (row-i>=0 && col-i>=0) board[row-i][col-i]++;
			//left bottom
			if (row+i<board.length && col-i>=0) board[row+i][col-i]++;
			//right top
			if (row-i>=0 && col+i<board.length) board[row-i][col+i]++;
			//right bottom
			if (row+i<board.length && col+i<board.length) board[row+i][col+i]++;
		}
		board[row][col]=-1;
	}
	
	public static void unfillBoard(int [][] board, int row, int col) {
		//row
		for (int i=0;i<board.length;i++) board[i][col]--;
		//col
		for (int i=0;i<board.length;i++) board[row][i]--;
		//diagonals
		for (int i=1;i<board.length;i++) {
			//left top
			if (row-i>=0 && col-i>=0) board[row-i][col-i]--;
			//left bottom
			if (row+i<board.length && col-i>=0) board[row+i][col-i]--;
			//right top
			if (row-i>=0 && col+i<board.length) board[row-i][col+i]--;
			//right bottom
			if (row+i<board.length && col+i<board.length) board[row+i][col+i]--;
		}
		board[row][col]=0;
	}
	
	public static void search (int [][] board, int [] queenRowAtCol, int queenCount) {
		if (queenCount==8) {
			solutionCount++;
			if (solutionCount<10) sb.append(" "+solutionCount+"      ");
			else sb.append(solutionCount+"      ");
			for (int i=0;i<queenRowAtCol.length;i++) {
				sb.append(queenRowAtCol[i]+1);
				if (i<queenRowAtCol.length-1) sb.append(" ");
			}
			sb.append("\n");
		} else {
			int col=-1;
			for (int i=0;i<queenRowAtCol.length;i++) if (queenRowAtCol[i]==-1) {
				col=i;
				break;
			}
			if (col!=-1) {
				for (int row=0;row<board.length;row++) {
					if (board[row][col]==0) {
						queenRowAtCol[col]=row;
						fillBoard(board,row,col);
						search(board,queenRowAtCol,queenCount+1);
						unfillBoard(board,row,col);
						queenRowAtCol[col]=-1;
					}
				}
			}
		}
	}
	
	public static void printSolution (int [][] map) {
		for (int i=0;i<map.length;i++) {
			for (int i2=0;i2<map.length;i2++) {
				if (map[i][i2]==-1) System.out.print(map[i][i2]+" ");
				else System.out.print(" "+map[i][i2]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		sb=new StringBuilder();
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			br.readLine(); //empty
			StringTokenizer st=new StringTokenizer(br.readLine());
			int [][] board=new int [8][8];
			int row=Integer.parseInt(st.nextToken())-1;
			int col=Integer.parseInt(st.nextToken())-1;
			fillBoard(board,row,col);
			int [] queenRowAtCol=new int [8];
			Arrays.fill(queenRowAtCol, -1);
			queenRowAtCol[col]=row;
			

			sb.append("SOLN       COLUMN\n #      1 2 3 4 5 6 7 8\n\n");
			solutionCount=0;
			search(board,queenRowAtCol,1);
			if (testCase<testCaseCount-1) sb.append("\n");
		}
		System.out.print(sb.toString());
	}
	
}