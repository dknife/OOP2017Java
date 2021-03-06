import java.util.Scanner;

public class Ex2017_03_TicTacToe {
	
	static Scanner scanner;
	
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
	
	public static void printValue(int[][] a) {
		System.out.println("------strategic evaluation-------");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}	System.out.println("");
		}
	}
	public static void printArray(int[][] a) {
		System.out.println("-------Game Board-----");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				char C=0;
				if(a[i][j]==0) C='_';
				else if(a[i][j]>0) C='X';
				else if(a[i][j]<0) C='O';
				System.out.print(C+" ");
			}	System.out.println("");
		}
		int winner = whoWon(a);
		switch(winner) {
		case 0: System.out.println("On-Going"); break;
		case 1: System.out.println("Sorry, You lost"); break;
		case -1: System.out.println("Congratulations! You Win!"); break;
		case 10: System.out.println("Draw!"); break;
		default: System.out.println("error"); break;
		}
		if(winner!=0) System.exit(0);
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
	
	public static boolean winningPlay(int[][] board) {
		// 이기는 수를 찾아 두기 
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(inputOK(row,col,board)) {
					board[row][col] = 1;
					if( whoWon(board) == 1) {
						return true;
					}
					else board[row][col] = 0;
				}
			}
		}
		return false;
	}
	
	public static boolean defencePlay(int[][] board) {
		// 이기는 수를 찾아 두기 
		for(int row=0;row<3;row++) {
			for(int col=0;col<3;col++) {
				if(inputOK(row,col,board)) {
					board[row][col] = -1;
					if( whoWon(board) == -1) {
						board[row][col] = 1;
						return true;
					}
					else board[row][col] = 0;
				}
			}
		}
		return false;
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
	
	public static void doComputer(int[][] board) {
		int row, col;
		
		// 이기는 수가 있나?
		boolean done = winningPlay(board);
		if(done) {
			printArray(board);
			return;
		}
		// 남이 이기지 못 하게 하는 수가 있나
		done = defencePlay(board);
		if(done) {
			printArray(board);
			return;
		}
		
		int[][] value = evaluatePlay(board);		
		printValue(value);
		
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
		board[bestRow][bestCol] = 1;
		
	}
	
	public static void doUser(int[][] board) {
		boolean inputWating = true;
		
		while(inputWating) {
			System.out.print("Which element? (row, col): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			if(inputOK(row,col, board)) {
				board[row][col] = -1;
				inputWating = false;
			}
		}
	}
	
	public static void main(String[] args) {
	
		int[][] myArray ={{0,0,0}, {0,0,0}, {0,0,0}};
		int row, col;
		
		scanner = new Scanner(System.in);
		printArray(myArray);
		
		int command = 0;
		while(command!=1 && command!=2) {
			System.out.print("Who plays first? 1. You 2. Computer : ");
			command = scanner.nextInt();
		}
		
		while(true) {
			if(command ==1) { // user
				doUser(myArray);
				printArray(myArray); command = 2;
			}
			else if(command==2) { // computer
				doComputer(myArray);
				printArray(myArray); command = 1;
			}
		}

	}

}
