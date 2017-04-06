import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// TicTacToeEngine
// int[] move = TicTacToeEngine.bestMove(int[][] board)

// true/false = TicTacToeEngine.inputOK(int r, int c, int[][] board)
// 
//-1(user)/1(computer)/0(on-going)/10(draw) 
//               = TicTacToeEngine.whoWon(board);

public class GuiTicTacToe extends JFrame {
	
	int board[][] = {{0,0,0},{0,0,0},{0,0,0}};
	JButton btn[][] = new JButton[3][3];
	MyActionListener l[][] = new MyActionListener[3][3];
	int move[] = {-1,-1};
	
	class MyActionListener implements ActionListener {
		public int row; 
		public int col;
		MyActionListener(int r, int c) { row=r; col=c; }
		public void actionPerformed(ActionEvent e) {	
			if(!TicTacToeEngine.inputOK(row, col, board)) 
				return;
			board[row][col] = -1;
			move = TicTacToeEngine.bestMove(board);			
			JButton b = (JButton) e.getSource();
			b.setBackground(Color.RED);
			btn[move[0]][move[1]].setBackground(Color.BLUE);
			board[move[0]][move[1]] = 1;
			int winner = TicTacToeEngine.whoWon(board);
			switch(winner) {
			case 0: break;
			case 1: b.setText("You Lost"); break;
			case -1: b.setText("You win!"); break;
			case 10: b.setText("DRAW"); break;
			}
		}
	}
	
	GuiTicTacToe() {
		setTitle("TicTacToe Game");
		setSize(500,500);
		setLayout(new GridLayout(3,3,0,0));		
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++){
				btn[r][c] = new JButton(r+","+c);
				this.add(btn[r][c]);
				l[r][c] = new MyActionListener(r,c);
				btn[r][c].addActionListener(l[r][c]);
			}
		}
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String []s) {
		GuiTicTacToe frame = new GuiTicTacToe();
		
	}

}
