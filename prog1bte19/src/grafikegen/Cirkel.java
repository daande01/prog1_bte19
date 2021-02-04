package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Cirkel extends JComponent implements KeyListener{

	private int x;
	private int y;
	private int xv=3;
	private int yv=1;
	private Color cc;
	private int r=25;
	private int wy=500;
	private int wx= 500;



	public Cirkel(Color c) {
		addKeyListener(this);
		cc=c;
		this.setPreferredSize(new Dimension(wx,wy));
		x = 0;
		y = 0;
		Timer t = new Timer(10, e -> {

			update();
			repaint();

			wy=getSize().height;
			wx=getSize().width;
		});
		t.start();


	}
	public void update() {

		x+=xv;
		y+=yv;


		if (y>=(wy-(r*2))) {

			yv*=-1;


		}
		if (x>=(wx-(r*2))) {

			xv*=-1;

		}
		if (y<=0) {

			yv*=-1;

		}
		if (x<=0) {

			xv*=-1;

		}





	}
	@Override
	public void paint(Graphics g) {
		super.paintComponents(g);
		g.setColor(cc);

		g.fillOval(x, y, r*2, r*2);

	}

	public static void main(String[] args) {

		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		j.setContentPane(new Cirkel(Color.CYAN));
		j.setVisible(true);
		j.pack();

		j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
	}
	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_UP) {

			y=y-5;

		}


	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFocusTraversable() {
		// TODO Auto-generated method stub
		return true;
	}



}
