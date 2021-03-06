import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex2017_08_03_ItemEvent extends JFrame {
	
	JLabel explanation;
	JLabel sumLabel;
	int totalPrice = 0;
	JCheckBox check[];
	String titles[] = {"사과", "배", "체리", "갈치", "고등어"};
	int price[] = { 100, 200, 5000, 10000, 5000 };
	
	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int itemPrice=0;
			JCheckBox box = (JCheckBox) e.getItem();
			for(int i=0; i<check.length; i++) {
				if(box==check[i]) {
					itemPrice = price[i];
				}
			}
			if( e.getStateChange() == ItemEvent.SELECTED ) {
				// add
				totalPrice += itemPrice;
			}
			else {
				// subtract
				totalPrice -= itemPrice;
			}
			sumLabel.setText("총합: "+totalPrice);
		}
	}

	Ex2017_08_03_ItemEvent() {
		setTitle("item event handling");
		setBounds(100,100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		// JLabel for explanation
		String string = new String("가격정보: ");
		for(int i=0; i<price.length; i++) {
			string = string.concat(titles[i]+":"+price[i]+",");
		}
		explanation = new JLabel(string);
		explanation.setBounds(10, 10,  1000,  50);
		add(explanation);
		
		check = new JCheckBox[price.length];
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<price.length; i++) {
			int width = 70;
			check[i] = new JCheckBox(titles[i]);
			check[i].setBounds(10+i*width, 60, width, 30);
			check[i].addItemListener(listener);
			add(check[i]);
		}
		
		sumLabel = new JLabel("총합: 0원");
		sumLabel.setBounds(10, 100, 1000, 50);
		add(sumLabel);
		
		setVisible(true);
	}
	public static void main(String Arg[]) {
		new Ex2017_08_03_ItemEvent();
	}
	
	

}
