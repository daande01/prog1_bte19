import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tank = 50;
		double pris = 9.5;

		int m�ngd = Integer.parseInt(JOptionPane.showInputDialog(null, "ange br�nsle m�ngd"));

		if (m�ngd > 10) {

			System.out.println("k�r vidare!!!!");

		} else {

			int m�ngdAttFylla = tank - m�ngd;
			double kostnad = m�ngdAttFylla * pris;

			double kostnadAvrundad = (int) (kostnad + 0.5);

			System.out.println("m�ngd att fylla:" + m�ngdAttFylla + "\nkostnad:" + kostnadAvrundad);

		}

	}

}
