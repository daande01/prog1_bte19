package arrayer;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arr2 {
	public static void main(String[] args) {

		int[] k=new int[5];

		for(int i =0;i<5;i++){
		String s1=JOptionPane.showInputDialog("ange ett tal");

		k[i] =Integer.parseInt(s1);
		}

		System.out.println(Arrays.toString(k));
	}
}
