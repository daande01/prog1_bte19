package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafikknapplambda extends JFrame  {

	JLabel l1 = new JLabel("hej"); // instansvariabler
	JButton b1 = new JButton("byttext"); // instansvariabler

	public Grafikknapplambda() {

		setLayout(new FlowLayout());
		setVisible(true);
		add(l1);
		add(b1);
		b1.addActionListener(e->{

			l1.setText("hej då");

		});


		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new Grafikknapplambda();

	}



}
