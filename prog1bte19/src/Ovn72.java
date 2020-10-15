import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tank = 50;
		double pris = 9.5;

		int mängd = Integer.parseInt(JOptionPane.showInputDialog(null, "ange bränsle mängd"));

		if (mängd > 10) {

			System.out.println("kör vidare!!!!");

		} else {

			int mängdAttFylla = tank - mängd;
			double kostnad = mängdAttFylla * pris;

			double kostnadAvrundad = (int) (kostnad + 0.5);

			System.out.println("mängd att fylla:" + mängdAttFylla + "\nkostnad:" + kostnadAvrundad);

		}

	}

}
