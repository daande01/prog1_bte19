package grafikegen.bollar;

import java.awt.Color;

public class Boll {


	private double x;
	private double y;
	private int r;
	private Color c;
	private int xv;
	private int yv;

	public Boll(double xx, double yy,int rr, Color cc, int xvxv ,int yvyv ) {

		this.x=xx;
		this.y=yy;
		this.r=rr;
		this.c=cc;
		this.xv=xvxv;
		this.yv=yvyv;

	}


	public int xToInt() {
		return (int) Math.round(x);
	}
	public int yToInt() {
		return (int) Math.round(y);
	}


}
