package TestPackage;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	
	private JButton[] button = new JButton[7];
	
	public FlowLayoutTest() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("FlowLayoutTest");
		setSize(250,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; i < button.length; i++) {
			button[i] = new JButton(""+(i+1));
		}
		
	}

	private void setInitLayout() {
		
		for(int i = 0; i < button.length; i++) {
			add(button[i]);
		}
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
