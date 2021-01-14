package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafiktext extends JFrame {


	public Grafiktext() {

		JLabel l1 = new JLabel("hej");


		setLayout(new FlowLayout());
		setVisible(true);
		add(l1);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}



	public static void main(String[] args) {

		new Grafiktext();

	}



}
