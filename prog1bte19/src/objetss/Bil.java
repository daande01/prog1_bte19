package objetss;

import java.awt.Color;

public class Bil {

	private int pris; // instansvariabel , medlemsvariabel, objetsvariabel
	private int hk; // private=modifierare public,private,protected,inget alls= paket synlighet
	private String märke; // dessa är nu inkapslade
	private Color färg; // säkerhet

	public Bil() { // konstruktor , kan finnas många , bara dom skiljer sig åt gällande antal
					// inprametrar eller datatyper

		this.pris = 0; // instansvariabeln
		this.hk = 100;
		this.märke = "not set";
		this.färg = Color.black;

		System.out.println(pris + " " + hk + " " + märke + " " + färg.toString());

	}
	public Bil(int p, int h, String m, Color f) {

		this.pris=p; // ger den aktuella bilen egenskaper
		this.hk=h;  // sätter instansvariablerna
		this.märke=m;
		this.färg=f;
		System.out.println(pris + " " + hk + " " + märke + " " + färg.toString());


	}
	public void färgByte() {

		färg=Color.white;

	}
	@Override
	public String toString() {

		return pris + " " + hk + " " + märke + " " + färg.toString();

	}

	public static void main(String[] args) {

		Bil b1=new Bil();  // referensvariabel som heter b1 av typen Bil samt skapande av objekt

		new Bil(100000, 200,"saab",Color.CYAN);
		b1.färgByte();
		System.out.println(b1.toString());



	}

}
