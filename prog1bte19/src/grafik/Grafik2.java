package grafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafik2 extends JFrame implements ActionListener {

	JButton b1 = new JButton("knapp1");
	JButton b2 = new JButton("knapp2");
	JLabel l1 = new JLabel("");

	public Grafik2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		add(b1);
		add(b2);
		add(l1);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public static void main(String[] args) {
		new Grafik2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {

			l1.setText("du har klickat på knapp1");
		}
		if (e.getSource() == b2) {

			l1.setText("du har klickat på knapp2");
		}

	}

}
