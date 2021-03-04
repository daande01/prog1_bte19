package grafikegen;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent {

	private static int x = 0;
	private static int y = 0;

	public Kombo() {
		// TODO Auto-generated constructor stub

		this.setPreferredSize(new Dimension(500, 500));

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.fillRect(x, y, 50, 50);

	}

	public static void main(String[] args) {
		Kombo k= new Kombo();
		JFrame f = new JFrame();
		JButton b = new JButton("move");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(b);
		p.add(k);
		b.addActionListener(e->{

			x=200;
			k.repaint();

		});

		Container c = f.getContentPane();

		c.add(p);

		f.setVisible(true);
		f.pack();

	}

}
