package loopar;

import java.util.Scanner;

public class ovn89 {

	public static void main(String[] args) {
		int val;
		int saldo=1000;
		Scanner sc = new Scanner(System.in);
		final int i=20 ;

		Scanner sc1 = new Scanner(System.in);


		double d = Math.PI;


		do {
			System.out.println("MENY \n 1.ins�ttning \n 2.uttag \n 3.visa saldo\n 4.avsluta");
			val = sc.nextInt();
			switch (val) {
			case 1:
				System.out.println("du har valt 1");
				break;
			case 2:
				System.out.println("du har valt 2");
				break;

			case 4:
				System.out.println("v�lkommen tillbaka");
				break;

			default:
				System.out.println("fel val");
				break;
			}

		} while (val != 4);

	}

}
