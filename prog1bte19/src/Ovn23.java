

import java.util.Scanner;

public class Ovn23 {
	public static void main(String[] args) {

		Scanner sc =new  Scanner(System.in);

		System.out.print("ange �lder");
		int �lder = sc.nextInt();

		// (34+10) /10 ===4.4
		// int =(int)4.4
		// 4*10

		int tioTal= ((int)((�lder+10) / 10.0)) *10;

		int rest= tioTal-�lder;

		System.out.print(tioTal +""+ rest);









	}
}
