package swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {


	private JLabel bilder= new JLabel(new ImageIcon("bilder//mountain-5941381_640.jpg"));

	private JButton switchImg= new JButton("switch");

	public Bildväxlare() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000,1000);
		add(bilder);
		add(switchImg);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		switchImg.addActionListener(e->{

			bilder.setIcon(new ImageIcon("bilder//sea-5621150_640.jpg"));


			//bilder.getIcon().toString().equals(anObject)



		});

	}





	public static void main(String[] args) {

		new Bildväxlare();

	}


}
