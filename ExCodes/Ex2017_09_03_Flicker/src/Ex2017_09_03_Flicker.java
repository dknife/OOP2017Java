
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



public class Ex2017_09_03_Flicker extends JFrame {


	final int sec = 0;
	final int centiSec = 1;
	
	Ex2017_09_03_Flicker() {
		setTitle("flickering with threads");
		setBounds(0,0,500,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JLabel l1;
		MyFlickeringLabel l2, l3;
		l1 = new JLabel("Elapsed Time (sec)");
		l2 = new MyFlickeringLabel(sec);
		l3 = new MyFlickeringLabel(centiSec);
		
		Thread th1 = new Thread(l2);
		th1.start();
		Thread th2 = new Thread(l3);
		th2.start();
		
		this.add(l1); 
		this.add(l2);
		this.add(l3);
		
		setVisible(true);		
	}
	
	public static void main(String[] argv) {
		new Ex2017_09_03_Flicker();
	}
}
