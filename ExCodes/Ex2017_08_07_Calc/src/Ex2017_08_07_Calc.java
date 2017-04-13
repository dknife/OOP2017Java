
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_08_07_Calc extends JFrame {

	float val[] = {0, 0};
	float result = 0;
	int op = -1;  // 0: + , 1: - , 2: *, 3: /, 4: =
	int whichValue = 0; // 0 or 1
	
	JLabel Display;	
	
	JButton NumBtn[] = new JButton[10];
	String opStr[] = { "+", "-", "x", "/", "=" };
	JButton Operator[] = new JButton[5];			
	
	class ALforNumbers implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			for(int i=0; i < NumBtn.length; i++) {
				if (btn == NumBtn[i]) {
					val[whichValue]*=10;
					val[whichValue]+=i;
					Display.setText(""+val[whichValue]);
				}
			}
		}
	}
	class ALforOperators implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			for(int i=0; i < Operator.length; i++) {
				if (btn == Operator[i]) {
					switch(i) {
					case 0:
					case 1:
					case 2:
					case 3:
						op=i; 
						whichValue=1; break;
					case 4:
						if(op==0) result = val[0]+val[1];
						else if(op==1) result = val[0]-val[1];
						else if(op==2) result = val[0]*val[1];
						else result = val[0]/val[1];
						val[0] = val[1] = 0;
						whichValue = 0;
						Display.setText(""+result);
						break;
					}
				}
			}
		}
	}
	
	Ex2017_08_07_Calc() {
		setTitle("My Own Calculator");
		setBounds(10,10, 500,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Display = new JLabel("0");
		Display.setBounds(25,50,400,100);
		Display.setBackground(Color.BLUE);
		Display.setForeground(Color.YELLOW);
		Display.setFont(new Font("Verdana", Font.BOLD, 25));
		Display.setOpaque(true);
		
		Display.setHorizontalAlignment(SwingConstants.RIGHT);
		add(Display);
		
		int btnWidth = 100;
		for(int i=1; i<NumBtn.length; i++) {			
			NumBtn[i] = new JButton(""+i);			
			NumBtn[i].setBounds(
					25 +((i-1)%3)*btnWidth, 
					175+((i-1)/3)*btnWidth, btnWidth, btnWidth);
			add(NumBtn[i]);
			NumBtn[i].addActionListener(new ALforNumbers());
		}
		NumBtn[0] = new JButton("0");
		NumBtn[0].setBounds(25, 175+3*btnWidth, 2*btnWidth, btnWidth);
		add(NumBtn[0]);
		NumBtn[0].addActionListener(new ALforNumbers());
		
		for(int i=0; i<Operator.length; i++) {			
			Operator[i] = new JButton(opStr[i]);			
			if(i!=Operator.length-1) {
				Operator[i].setBounds(
					25 +3*btnWidth, 
					175+i*btnWidth, btnWidth, btnWidth);
			}
			else 
				Operator[i].setBounds(
						25 +2*btnWidth, 
						175+3*btnWidth, btnWidth, btnWidth);
			add(Operator[i]);
			Operator[i].addActionListener(new ALforOperators());
		}
		
			
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new Ex2017_08_07_Calc();
	}
}
