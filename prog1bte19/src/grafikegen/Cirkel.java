package grafikegen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Cirkel extends JComponent {

	private int x;
	private int y;

	public Cirkel() {

		x = 10;
		y = 10;
		Timer t = new Timer(100, e -> {

			update();
			repaint();

		});
		t.start();
	}
	public void update() {
		x++;
		y++;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.setColor(Color.BLUE);

		g.fillOval(x, y, 100, 100);

	}

	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		j.setContentPane(new Cirkel());
		j.setVisible(true);
		j.setSize(500, 500);

	}

}
