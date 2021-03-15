package objetss.bank;

public class Bank {



	public static void main(String[] args) {


		Person p1=new Person(1982, "daniel");

		p1.konton.add(new Konto(1));

		p1.konton.get(0).insättning(100);

		int saldo=p1.konton.get(0).uttag(50);
		System.out.println(saldo);

	}


}
