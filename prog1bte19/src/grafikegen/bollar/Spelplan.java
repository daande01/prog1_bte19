package grafikegen.bollar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Spelplan extends JComponent {

	Boll[] b = new Boll[100];

	public Spelplan() {

		this.setPreferredSize(new Dimension(500, 500));

		for (int i = 0; i < b.length; i++) {

			b[i] = new Boll((int) (Math.random() * 500),
					(int) (Math.random() * 500),
					(int) (Math.random() * 100 + 20),
					new Color((int) (Math.random() * 255),
							(int) (Math.random() * 255),
							(int) (Math.random() * 255)),
					(int) (Math.random() * 3 + 1),
					(int) (Math.random() * 3 + 1));

		}

		Timer t = new Timer(20, e -> {

			for (Boll boll : b) {

				boll.update();
			}


			repaint();
		});

		t.start();

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		for (Boll boll : b) {

			boll.rita(g);
		}


	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setContentPane(new Spelplan());
		f.setVisible(true);
		f.pack();

	}

}
