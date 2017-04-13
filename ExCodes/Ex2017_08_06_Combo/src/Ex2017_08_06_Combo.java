import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex2017_08_06_Combo extends JFrame {

	ImageIcon img[];
	String items[] = { "facebook", "instagram", "twitter" };	
	JLabel imgLabel;

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JComboBox bx = (JComboBox) e.getSource();
			int idx = bx.getSelectedIndex();
			imgLabel.setIcon(img[idx]);
		}
	}
	
	Ex2017_08_06_Combo() {
		setTitle("radio buttons");
		setBounds(10,10, 500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JComboBox combo = new JComboBox(items);
		combo.addActionListener(new MyActionListener());
		add(combo);
		
		img = new ImageIcon[3];
		img[0] = new ImageIcon("images/a.jpg");
		img[1] = new ImageIcon("images/b.jpg");
		img[2] = new ImageIcon("images/c.jpg");
		imgLabel = new JLabel(img[0]);
		add(imgLabel);
		
		setVisible(true);
	}
	
	public static void main(String[] a) {
		new Ex2017_08_06_Combo();
	}
}