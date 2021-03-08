package grafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class upp2E extends JFrame {

	JTextField t1 = new JTextField(40);
	JButton b1 = new JButton("send");
	JLabel l1 = new JLabel("hej");

	public upp2E() {

		setVisible(true);
		setSize(new Dimension(500, 500));
		setLayout(new FlowLayout());
		add(t1);
		add(b1);
		add(l1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b1.addActionListener(e -> {

			l1.setText(t1.getText());

		});

	}

	public static void main(String[] args) {

		new upp2E();
	}

}
