package TestPackage;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ComponentsTest extends JFrame {

	// (JButton, JLabel, JTextField, JPasswordField, JCheckbox)

	private JButton button = new JButton();
	private JLabel label = new JLabel();
	private JTextField field = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JCheckBox checkbox = new JCheckBox();

	public ComponentsTest() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("Components Test");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("버튼");
		label = new JLabel("라벨");
		field = new JTextField("텍스트", 20);
		password = new JPasswordField("비번", 10);
		checkbox = new JCheckBox("동의");

	}

	private void setInitLayout() {

		setLayout(new FlowLayout());

		add(button);
		add(label);
		add(field);
		add(password);
		add(checkbox);

		setVisible(true);
	}

	public static void main(String[] args) {
		new ComponentsTest();
	}
}
