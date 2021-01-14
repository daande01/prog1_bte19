package objetss;

import java.awt.Color;

public class Bil {

	private int pris; // instansvariabel , medlemsvariabel, objetsvariabel
	private int hk; // private=modifierare public,private,protected,inget alls= paket synlighet
	private String m�rke; // dessa �r nu inkapslade
	private Color f�rg; // s�kerhet

	public Bil() { // konstruktor , kan finnas m�nga , bara dom skiljer sig �t g�llande antal
					// inprametrar eller datatyper

		this.pris = 0; // instansvariabeln
		this.hk = 100;
		this.m�rke = "not set";
		this.f�rg = Color.black;

		System.out.println(pris + " " + hk + " " + m�rke + " " + f�rg.toString());

	}
	public Bil(int p, int h, String m, Color f) {

		this.pris=p; // ger den aktuella bilen egenskaper
		this.hk=h;  // s�tter instansvariablerna
		this.m�rke=m;
		this.f�rg=f;
		System.out.println(pris + " " + hk + " " + m�rke + " " + f�rg.toString());


	}
	public void f�rgByte() {

		f�rg=Color.white;

	}
	@Override
	public String toString() {

		return pris + " " + hk + " " + m�rke + " " + f�rg.toString();

	}

	public static void main(String[] args) {

		Bil b1=new Bil();  // referensvariabel som heter b1 av typen Bil samt skapande av objekt

		new Bil(100000, 200,"saab",Color.CYAN);
		b1.f�rgByte();
		System.out.println(b1.toString());



	}

}
