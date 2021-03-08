package grafik;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class upp3e extends JComponent {

	int [] x= {100,250,290,300 };
	int [] y= {100,150,180,300};


	public upp3e() {


		this.setPreferredSize(new Dimension(500,500));

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(new Color(255,140,120));
		g.drawPolygon(x,y,x.length);
	}




	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setVisible(true);

		f.setLayout(new FlowLayout());
		f.setContentPane(new upp3e());
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();

	}
}
