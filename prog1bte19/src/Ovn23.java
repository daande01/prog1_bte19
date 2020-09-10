

import java.util.Scanner;

public class Ovn23 {
	public static void main(String[] args) {

		Scanner sc =new  Scanner(System.in);

		System.out.print("ange ålder");
		int ålder = sc.nextInt();

		// (34+10) /10 ===4.4
		// int =(int)4.4
		// 4*10

		int tioTal= ((int)((ålder+10) / 10.0)) *10;

		int rest= tioTal-ålder;

		System.out.print(tioTal +""+ rest);









	}
}
