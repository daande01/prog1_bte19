package grafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafik4 extends JFrame {

	JButton b1 = new JButton("knapp1");
	JButton b2 = new JButton("knapp2");
	JLabel l1 = new JLabel("");

	public Grafik4() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		add(b1);
		add(b2);
		add(l1);
		b1.addActionListener(e->{
			l1.setText("du har klickat på knapp 1");
		});

		b2.addActionListener(e->{
			l1.setText("du har klickat på knapp 2");
		});
	}

	public static void main(String[] args) {
		new Grafik4();
	}

}
