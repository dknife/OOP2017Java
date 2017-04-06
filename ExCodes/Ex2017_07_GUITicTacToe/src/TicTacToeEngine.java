public class TicTacToeEngine {
		
	public static int sumRow(int[][] array, int r) {
		int sum = 0;
		for(int i=0;i<3;i++) sum+=array[r][i];				
		return sum;
	}
	public static int sumCol(int[][] array, int c) {
		int sum = 0;
		for(int i=0;i<3;i++) sum+=array[i][c];				
		return sum;
	}
	public static int sumDiagonal(int[][] array) {
		int sum = 0;
		for(int i=0;i<3;i++) sum+=array[i][i];				
		return sum;
	}
	public static int sumAntiDiagonal(int[][] array) {
		int sum = 0;
		for(int i=0;i<3;i++) sum+=array[i][2-i];				
		return sum;
	}
	public static int evaluateRow(int[][] array, int r) {
		int evaluatedValue = 0;
		for(int i=0;i<3;i++) {
			if(array[r][i]<0) return 0;
			else {
				evaluatedValue += array[r][i]+1;
			}
		}
		return evaluatedValue;
	}
	public static int evaluateCol(int[][] array, int c) {
		int evaluatedValue = 0;
		for(int i=0;i<3;i++) {
			if(array[i][c]<0) return 0;
			else {
				evaluatedValue += array[i][c]+1;
			}
		}
		return evaluatedValue;
	}
	public static int evaluateDiagonal(int[][] array) {
		int evaluatedValue = 0;
		for(int i=0;i<3;i++) {
			if(array[i][i]<0) return 0;
			else {
				evaluatedValue += array[i][i]+1;
			}
		}
		return evaluatedValue;
	}
	public static int evaluateAntiDiagonal(int[][] array) {
		int evaluatedValue = 0;
		for(int i=0;i<3;i++) {
			if(array[i][2-i]<0) return 0;
			else {
				evaluatedValue += array[i][2-i]+1;
			}
		}
		return evaluatedValue;
	}
		
	public static int whoWon(int[][] a) {
		for(int i=0;i<3;i++) {
			if(sumRow(a, i)==3) return 1;
			if(sumCol(a, i)==3) return 1;			
			if(sumRow(a, i)==-3) return -1;
			if(sumCol(a, i)==-3) return -1;			
		}		
		if(sumDiagonal(a)==3) return 1;
		if(sumDiagonal(a)==-3) return -1;
		if(sumAntiDiagonal(a)==3) return 1;
		if(sumAntiDiagonal(a)==-3) return -1;
		int placed=0;
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++)
				if(a[i][j]!=0) placed++;
		if(placed==9) return 10;
		return 0;
	}
		
	public static boolean inputOK(int r, int c, int[][] arr) {
		if(r < 0 || r>2) return false;
		if(c < 0 || c>2) return false;
		if(arr[r][c]!=0) return false;
		return true;
	}
		
	public static int[] winningPlay(int[][] board) {
		// 이기는 수를 찾아 두기 
		int move[] = new int[2];
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(inputOK(row,col,board)) {
					board[row][col] = 1;
					if( whoWon(board) == 1) {
						board[row][col]=0;
						move[0] = row; move[1] = col;
						return move;
					}
					else board[row][col] = 0;
				}
			}
		}
		move[0] = -1; move[1] = -1;
		return move;
	}
	
	public static int[] defencePlay(int[][] board) {
		// 이기는 수를 찾아 두기
		int move[] = new int[2];
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(inputOK(row,col,board)) {
					board[row][col] = -1;
					if( whoWon(board) == -1) {
						board[row][col] = 0;
						move[0] = row; move[1] = col;
						return move;
					}
					else board[row][col] = 0;
				}
			}
		}
		move[0] = -1; move[1] = -1;
		return move;
	}
		
	public static int[][] evaluatePlay(int[][] board) {
		// 가장 좋아 보이는 곳 찾기
		int[][] value = new int[3][3];
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(board[row][col]!=0) 
					value[row][col] = -1;
				else {
					int evaluatedValue = 0;
					evaluatedValue += evaluateRow(board, row);
					evaluatedValue += evaluateCol(board, col);
					
					if(row==1 && col==1) {
						evaluatedValue += evaluateDiagonal(board);
						evaluatedValue += evaluateAntiDiagonal(board);
					}
					if( (row==0 && col==0) || (row==2 && col==2)) {
						evaluatedValue += evaluateDiagonal(board);						
					}
					if( (row==0 && col==2) || (row==2 && col==0)) {
						evaluatedValue += evaluateAntiDiagonal(board);	
					}
					value[row][col] = evaluatedValue;
				}
			}
		}
		return value;
	}
		
	public static int[] bestMove(int[][] board) {
		int row, col;
		int move[] = new int[2];
		// 이기는 수가 있나?
		move = winningPlay(board);
		if(move[0]>=0 && move[1]>=0) {
			return move;
		}
		// 남이 이기지 못 하게 하는 수가 있나
		move = defencePlay(board);
		if(move[0]>=0 && move[1]>=0) {
			return move;
		}
		
		int[][] value = evaluatePlay(board);		
		//printValue(value);
		
		int bestRow = 0; int bestCol = 0;
		int bestValue = value[bestRow][bestCol];
		for(row = 0; row<3; row++) {
			for(col = 0; col<3; col++) {
				if(value[row][col]>bestValue) {
					bestRow = row;
					bestCol = col;
					bestValue = value[row][col];
				}
			}
		}
		move[0] = bestRow;
		move[1] = bestCol;
		return move;
		
	}
		
}
