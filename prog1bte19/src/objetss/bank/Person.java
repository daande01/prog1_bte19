package objetss.bank;

import java.util.LinkedList;

public class Person {

	// vilka konton har personen
	LinkedList<Konto> konton= new LinkedList<Konto>();
	private int personnummer;
	private String namn;

	public Person(int pnr, String na) {

		personnummer=pnr;
		namn=na;

	}





}
