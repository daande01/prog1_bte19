package swinggrafik;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StenSaxP�se extends JFrame{

		private JButton stenSpelare = new JButton("sten");
		private JButton saxSpelare = new JButton("sax");
		private JButton p�seSpelare = new JButton("p�se");

		private JButton stenDator = new JButton("sten");
		private JButton saxDator = new JButton("sax");
		private JButton p�seDator = new JButton("p�se");
		int spelarVal;

	public StenSaxP�se() {

		stenDator.setBackground(Color.pink);
		saxDator.setEnabled(false);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(stenSpelare);
		add(saxSpelare);
		add(p�seSpelare);
		add(stenDator);
		add(saxDator);
		add(p�seDator);


		stenSpelare.addActionListener(e->{
			spelarVal=1;
			vinnare();

		});
		saxSpelare.addActionListener(e->{
			spelarVal=2;
			vinnare();
		});
		p�seSpelare.addActionListener(e->{
			spelarVal=3;
			vinnare();
		});


	}

	public void vinnare() {

		// implementera spelet utifr�n de regler som finns f�r spelet


	}







	public static void main(String[] args) {

			new StenSaxP�se();
	}

}
