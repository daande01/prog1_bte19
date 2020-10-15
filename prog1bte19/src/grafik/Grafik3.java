package grafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafik3 extends JFrame {

	JButton b1 = new JButton("knapp1");
	JButton b2 = new JButton("knapp2");
	JLabel l1 = new JLabel("");

	public Grafik3() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		add(b1);
		add(b2);
		add(l1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("du har klickat på knapp 2");

			}
		});
	}

	public static void main(String[] args) {
		new Grafik3();
	}

}
