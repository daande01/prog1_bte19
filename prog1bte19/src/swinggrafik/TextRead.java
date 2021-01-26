package swinggrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextRead extends JFrame {

private JTextField t1= new JTextField(20);
private JLabel l1 = new JLabel();

	public TextRead() {


		setLayout(new FlowLayout());

		add(t1);
		add(l1);
		setVisible(true);
		setSize(new Dimension(400,400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		t1.addActionListener(e->{

			l1.setText(   t1.getText()   );


		});



	}


	public static void main(String[] args) {

		new TextRead();

	}


}
