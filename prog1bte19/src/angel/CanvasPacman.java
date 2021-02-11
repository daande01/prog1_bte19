package angel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class CanvasPacman extends JComponent implements KeyListener {

	Figur pM = new Figur();

	public CanvasPacman() {

		addKeyListener(this);

		this.setPreferredSize(new Dimension(400, 400));

		Timer t = new Timer(1000, e -> {

			pM.changeMouth();
			repaint();

		});
		t.start();




	}

	public void update() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(pM.getColor());
		g.fillOval(pM.getX(), pM.getY(), pM.getR() * 2, pM.getR() * 2);
		g.setColor(getBackground());
		if (pM.ifMouth()) {
			g.fillPolygon(pM.getXarr(30), pM.getYarr(30), 3);
		}

	}


	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("test");
		int key = e.getKeyCode();
		int x = pM.getX();
		int y = pM.getY();

		switch (key) {

		case KeyEvent.VK_UP:
			System.out.println("Upp");

			pM.setY(y--);

			break;
		case KeyEvent.VK_DOWN:
			System.out.println("Ner");

			pM.setY(y++);

			break;
		case KeyEvent.VK_LEFT:
			System.out.println("Vänster");

			pM.setX(x--);

			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("Höger");

			pM.setX(x++);

			break;

		default:
			break;
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
System.out.println("typed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("typed");
	}

@Override
public boolean isFocusable() {
	// TODO Auto-generated method stub
	return true;
}
public static void main(String[] args) {

	JFrame f = new JFrame();
	f.setContentPane(new CanvasPacman());
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	f.pack();

}

}
