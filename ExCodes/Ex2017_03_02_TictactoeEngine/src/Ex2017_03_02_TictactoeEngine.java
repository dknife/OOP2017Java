
import java.util.Scanner;

public class Ex2017_03_02_TictactoeEngine {
	
	static Scanner scanner;

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
		int winner = TicTacToeEngine.whoWon(a);
		switch(winner) {
		case 0: System.out.println("On-Going"); break;
		case 1: System.out.println("Sorry, You lost"); break;
		case -1: System.out.println("Congratulations! You Win!"); break;
		case 10: System.out.println("Draw!"); break;
		default: System.out.println("error"); break;
		}
		if(winner!=0) System.exit(0);
	}
	
	
	
	public static void doUser(int[][] board) {
		boolean inputWating = true;
		
		while(inputWating) {
			System.out.print("Which element? (row, col): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			if(TicTacToeEngine.inputOK(row,col, board)) {
				board[row][col] = -1;
				inputWating = false;
			}
		}
	}
	
	public static void main(String[] args) {
	
		int[][] myArray ={{0,0,0}, {0,0,0}, {0,0,0}};
		int row, col;
		int move[] = new int[2];
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
				move = TicTacToeEngine.bestMove(myArray);
				myArray[move[0]][move[1]] = 1;
				printArray(myArray); command = 1;
			}
		}

	}

}
