import java.util.Scanner;

public class Ex2017_02_TicTacToe {
	

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
		default: System.out.println("error"); break;
		}
	}
	
	public static int whoWon(int[][] a) {
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=0;
			for(int j=0;j<3;j++) {				
				sum+=a[i][j];				
			}
			if(sum==3) return 1;
			else if(sum==-3) return -1;
			sum = 0;
			for(int j=0;j<3;j++) {				
				sum+=a[j][i];				
			}
			if(sum==3) return 1;
			else if(sum==-3) return -1;
		}
		sum=0;
		for(int i=0;i<3;i++) {
			sum+= a[i][i];			
		}
		if(sum==3) return 1;
		else if(sum==-3) return -1;
		sum=0;
		for(int i=0;i<3;i++) {
			sum+= a[i][2-i];			
		}
		if(sum==3) return 1;
		else if(sum==-3) return -1;
		
		return 0;
	}
	
	public static boolean inputOK(int r, int c, int[][] arr) {
	
		if(r < 0 || r>2) return false;
		if(c < 0 || c>2) return false;
		if(arr[r][c]!=0) return false;
		return true;
	}
	
	public static void main(String[] args) {
	
		int[][] myArray ={{0,0,0}, {0,0,0}, {0,0,0}};
		int row, col;
		
		Scanner scanner = new Scanner(System.in);
		printArray(myArray);
		
		while(true) {
			
			// computer
			// 이기는 수를 찾아 두기 
			for(row=0;row<3;row++) {
				for(col=0;col<3;col++) {
					if(inputOK(row,col,myArray)) {
						myArray[row][col] = 1;
						if( whoWon(myArray) == 1) {
							printArray(myArray);
							return;
						}
						else myArray[row][col] = 0;
					}
				}
			}
			
			boolean done=false;
			// 남이 이기지 못 하게 하는 수
			for(row=0;row<3 && !done;row++) {
				for(col=0;col<3 && !done;col++) {
					if(inputOK(row,col,myArray)) {
						myArray[row][col] = -1;
						if( whoWon(myArray) == -1) {
							myArray[row][col] = 1;
							done = true;
						}
						else myArray[row][col] = 0;
					}
				}
			}
			
			if(!done) {
				// 가장 좋아 보이는 곳 찾기
				int[][] value = new int[3][3];
				for(row=0;row<3;row++) {
					for(col=0;col<3;col++) {
						if(myArray[row][col]!=0) 
							value[row][col] = -1;
						else {
							int rowValue = 0;
							int colValue = 0;
							for(int i=0;i<3;i++) {
								if(myArray[row][i]<0) {
									rowValue = 0;
									i=3;
								}
								else {
									rowValue += myArray[row][i]+1;
								}
							}
							for(int i=0;i<3;i++) {
								if(myArray[i][col]<0) {
									colValue = 0;
									i=3;
								}
								else {
									colValue += myArray[i][col]+1;
								}
							}
							int diagValue = 0;
							if(row==1 && col==1) {
								if(myArray[0][0]!=-1 && myArray[2][2]!=-1) {
									diagValue += myArray[0][0] + myArray[2][2] + 2;
								}
								if(myArray[0][2]!=-1 && myArray[2][0]!=-1) {
									diagValue += myArray[0][0] + myArray[2][2] + 2;
								}
							}
							if(row==0 && col==0) {
								if(myArray[1][1]!=-1 && myArray[2][2]!=-1) {
									diagValue += myArray[1][1] + myArray[2][2] + 2;
								}
								
							}
							if(row==2 && col==0) {
								if(myArray[1][1]!=-1 && myArray[0][2]!=-1) {
									diagValue += myArray[1][1] + myArray[0][2] + 2;
								}
							}
							if(row==0 && col==2) {
								if(myArray[1][1]!=-1 && myArray[2][0]!=-1) {
									diagValue += myArray[1][1] + myArray[2][0] + 2;
								}
							}
							if(row==2 && col==2) {
								if(myArray[0][0]!=-1 && myArray[1][1]!=-1) {
									diagValue += myArray[0][0] + myArray[1][1] +2;
								}
							}
							value[row][col] = rowValue + colValue + diagValue;
						}
					}
				}
				
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
				myArray[bestRow][bestCol] = 1;
			}
			
			
			
			printArray(myArray);
			
			// user
			boolean inputWating = true;
			
			while(inputWating) {
				System.out.print("Which element? (row, col): ");
				row = scanner.nextInt();
				col = scanner.nextInt();
				if(inputOK(row,col, myArray)) {
					myArray[row][col] = -1;
					inputWating = false;
				}
			}
			
			printArray(myArray);
		}

	}

}
