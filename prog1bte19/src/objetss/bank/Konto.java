package objetss.bank;

public class Konto {



	private int saldo;
	static double r�nta=1.05;
	private int kontoNummer;

	public Konto(int koNr) {

		saldo=0;
		kontoNummer=koNr;

	}

	public void ins�ttning(int in) {

		saldo +=in;

	}
	public int uttag(int ut) {

		saldo-=ut;

		return saldo;
	}




}
