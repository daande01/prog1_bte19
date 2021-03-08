package pong;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Player extends JComponent  { // detta player objekt �r en jcomponent och vi vill
																// kunna hanter knapptryckningar med en metod som heter
																// keyPressed

	 int x = 500 / 2; // instansvariabler
	 int y = 440; // instansvariabler
	private int h = 5; // instansvariabler
	private int w = 50; // instansvariabler

	JPanel p1;

	public Player(JPanel p1) { // konstruktor som k�rs vi skapandet av ett objekt

			this.p1=p1;

	}



	@Override
	public void paint(Graphics g) { // som anv�nds f�r f�r att rita ut komponenter
		// TODO Auto-generated method stub
		g.setColor(Color.black);
		g.fillRect(x, y, w, h);// ritar rektangel (xled,yled,bredd,h�jd)

	}



	public void keyklick(KeyEvent e) { // metod som hanterar knapptryckningar
		// TODO Auto-generated method stub

		int key = e.getKeyCode();// h�mtar vilken tangent man tryckt p�
		if (key == KeyEvent.VK_RIGHT) {// j�mf�r h�mtad tangent med olika tangenter i detta fall h�ger piltangent

			x=x+5;; // �kar p� x v�rdet f�r playerplattan
			System.out.print("right");
			p1.repaint();// ritar ut plattan p� dess nya position
		}
		if (key == KeyEvent.VK_LEFT) {

			x-=5;;// minskar p� x v�rdet f�r playerplattan
			System.out.print("left");
			p1.repaint();// ritar ut plattan p� dess nya position

		}

	}




}
