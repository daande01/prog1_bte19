package swinggrafik;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GrafikknappInnerAnnonymLyssnare extends JFrame  {

	JLabel l1 = new JLabel("hej"); // instansvariabler
	JButton b1 = new JButton("byttext"); // instansvariabler

	public GrafikknappInnerAnnonymLyssnare() {

		setLayout(new FlowLayout());
		setVisible(true);
		add(l1);
		add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				l1.setText("hej då");

			}
		});


		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {

		new GrafikknappInnerAnnonymLyssnare();

	}



}
