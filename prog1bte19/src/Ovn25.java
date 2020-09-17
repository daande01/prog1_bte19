import javax.swing.JOptionPane;

public class Ovn25 {

	public static void main(String[] args) {

		// daniel Andersson
		//tor Hansson

		String namn=JOptionPane.showInputDialog("ange förnamn mellanslag efternamn");

		char fnamn= namn.charAt(0);

		int posMellan=namn.indexOf(' ');

		char enamn=namn.charAt(posMellan+1);

		System.out.println(fnamn+"."+enamn);

	}


}
