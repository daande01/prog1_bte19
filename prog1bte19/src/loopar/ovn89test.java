package loopar;

import java.util.Scanner;

public class ovn89test {

	public static void main(String[] args) {

		int val;
		Scanner sc = new Scanner(System.in);


		do {
		System.out.println("1:instättning   2:uttag");
		val=sc.nextInt();
		switch (val) {
		case 1:
			System.out.println("val 1");
			break;
		case 2:
			System.out.println("val 2");
			break;


		default:
			break;
		}
		}while(val>0);


	}

}
