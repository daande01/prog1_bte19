package loopar;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Repetition1 {


	public static void main(String[] args) {






		//------scanner

		Scanner sc =new Scanner(System.in);
		int [] arr1 =new int [3];

		for(int i=0; i<arr1.length; i++) {

			System.out.println("ange ett heltal");
			arr1[i]=sc.nextInt();

		}

		double summa=0;

		for (int i = 0; i < arr1.length; i++) {


			summa= summa+ arr1[i];


		}

		double medel = summa/3;



		System.out.println( Arrays.toString(arr1)   );





		//----------joptionpane

		int [] arr =new int [3];

		for(int i=0; i<arr.length; i++) {

			String s=JOptionPane.showInputDialog("ange ett heltal");

			arr[i]=Integer.parseInt(s);


		}

		System.out.println( Arrays.toString(arr)   );

	}






}
