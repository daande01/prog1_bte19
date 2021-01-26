package swinggrafik;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radiotest extends JFrame {

private JLabel l1 = new JLabel();
private JRadioButton r1= new JRadioButton();
private JRadioButton r2= new JRadioButton();
private JRadioButton r3= new JRadioButton();
private ButtonGroup g=new ButtonGroup();
private JButton b1 = new JButton("send");

	public Radiotest() {


		setLayout(new FlowLayout());

		g.add(r1);
		g.add(r2);
		g.add(r3);

		add(r1);
		add(r2);
		add(r3);
		add(l1);
		add(b1);
		b1.setEnabled(false);

		setVisible(true);
		setSize(new Dimension(400,400));
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b1.addActionListener(e->{

			if (r1.isSelected()) {

				l1.setText("du har valt häst");
			}else if(r2.isSelected()) {

				l1.setText("du har valt kanin");
			}else if(r3.isSelected()){

				l1.setText("du har valt hund");
			}else {

				l1.setText("du har inte valt något");
			}



		});

	}


	public static void main(String[] args) {

		new Radiotest();

	}


}
