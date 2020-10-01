package chartest;

import javax.swing.JOptionPane;

public class Chartest1 {

	public static void main(String[] args) {

		char c = '\u02A4';

		String s = ""+c;

		System.out.println(s);
		JOptionPane.showMessageDialog(null, s);

		 int i =c;
		 System.out.println(i);


	}




}
