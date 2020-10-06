package tal;

import java.util.Scanner;

public class Tid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ange tid i sekunder");

		int sekunder = sc.nextInt();

		// sekunder 7400

		int timmar = sekunder /3600;

	//               200 =   7400     - 2*3600
		int restTimmar= sekunder- timmar*3600;

		int minuter= restTimmar / 60;

		// int restMinuter = restTimmar - minuter*60
		int restMinuter= restTimmar%60;


		System.out.println("timmat:"+timmar+"\nminuter:"+minuter+"\nsekunder:"+restMinuter);

	}





}
