package loopar;

import java.util.Scanner;

public class Repetition3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean run=true;

		while (run) {

			System.out.println("1. ange REG \n2. boka tid \n3. avboka \n4. avsluta");

			int val = sc.nextInt();

			switch (val) {
			case 1:
				reg();
				break;

			case 2:
				System.out.println("du har valt boka tid");
				break;

			case 3:
				System.out.println("du har valt avboka");
				break;

			case 4:
				System.out.println("du har valt avsluta");
				run=false;
				break;

			default:
				break;
			}
		}

	}

	private static void reg() {



	}

}
