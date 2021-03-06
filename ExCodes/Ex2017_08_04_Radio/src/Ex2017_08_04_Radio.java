import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_08_04_Radio extends JFrame {

	ImageIcon img[];
	JRadioButton btn[];
	JLabel imgLabel;
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			for(int i=0;i<btn.length;i++) {
				if (btn[i] == (JRadioButton) e.getItem()) {
					imgLabel.setIcon(img[i]);
				}
			}
		}
	}
	
	Ex2017_08_04_Radio() {
		setTitle("radio buttons");
		setBounds(10,10, 500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.BLUE);
		ButtonGroup group = new ButtonGroup();	
		btn = new JRadioButton[3];
		btn[0] = new JRadioButton("facebook", true);
		btn[1] = new JRadioButton("instagram");
		btn[2] = new JRadioButton("twitter");
		MyItemListener l = new MyItemListener();
		for(JRadioButton b : btn ) {
			b.addItemListener(l);
			group.add(b);
			add(b);
		}
		img = new ImageIcon[3];
		img[0] = new ImageIcon("images/a.jpg");
		img[1] = new ImageIcon("images/b.jpg");
		img[2] = new ImageIcon("images/c.jpg");
		imgLabel = new JLabel(img[0]);
		add(imgLabel);
		
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new Ex2017_08_04_Radio();
	}
}
