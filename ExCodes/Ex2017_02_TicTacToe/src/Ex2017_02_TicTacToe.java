import java.util.Scanner;

public class Ex2017_02_TicTacToe {
	
	public static void printArray(int[][] a) {
		System.out.println("------------------------");
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
		case 0: System.out.println("on-going game"); break;
		case 1: System.out.println("Computer Win"); break;
		case -1: System.out.println("You Win"); break;
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
	
	public static void main(String[] args) {
	
		int[][] myArray ={{0,0,0}, {0,0,0}, {0,0,0}};
		
		Scanner scanner = new Scanner(System.in);
		printArray(myArray);
		
		while(true) {
			
			// user
			System.out.print("Which element? (row, col): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			myArray[row][col] = -1;
			printArray(myArray);
			
			// computer
			row = 0; col = 0;
			while(myArray[row][col]!=0) {
				col++;
				if(col>2) { row++; col=0; }
				if(row>2) return;
			}
			myArray[row][col] = 1;
			printArray(myArray);
		}

	}

}
