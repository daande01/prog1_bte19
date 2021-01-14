package swinggrafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikKnapp extends JFrame implements ActionListener {

	JLabel l1 = new JLabel("hej");  // instansvariabler
	JButton b1 = new JButton("byttext"); // instansvariabler


	public GrafikKnapp() {




		setLayout(new FlowLayout());
		setVisible(true);
		add(l1);
		add(b1);
		b1.addActionListener(this);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}



	public static void main(String[] args) {

		new GrafikKnapp();

	}



	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()== b1) {

			l1.setText("hej då");
		}

	}



}
