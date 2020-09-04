package var;

import javax.swing.JOptionPane;

public class Omvandling {


	public static void main(String[] args) {


		//int tal1 = (int) (4.3+0.5);// explecit typomvandling eller cast

		//System.out.print(tal1);


		String i =JOptionPane.showInputDialog("ange ett tal");

		double tal = Double.parseDouble(i);

		double summa= tal+tal;

		System.out.print(summa);

	}


}
