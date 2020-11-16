package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class input {

	public static void main(String[] args) {

		int arr[] = new int [10];


		for(int i=0;i<10;i++) {

			String s = JOptionPane.showInputDialog("ange tal");

			arr[i] =Integer.parseInt(s);

		}

		System.out.println(Arrays.toString(arr));

	}


}
