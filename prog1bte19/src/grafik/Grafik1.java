package grafik;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Grafik1 extends JFrame implements ActionListener {


	boolean bb=true;

	JButton b1 = new JButton("send");
	JLabel l1 = new JLabel("hej");
	public Grafik1() {
		setLayout(new FlowLayout());
		add(b1);
		add(l1);
		b1.addActionListener(this);
		setVisible(true);
		setSize(400, 400);
	}
	public static void main(String[] args) {
		new Grafik1();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (bb==false) {

			l1.setText("hej");
			bb=true;
		}else {
			l1.setText("hejdå");
			bb=false;
		}
	}
}
