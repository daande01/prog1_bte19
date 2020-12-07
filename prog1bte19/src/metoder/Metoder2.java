package metoder;

import java.util.Arrays;

public class Metoder2 {

	public static void main(String[] args) {

		int [] i = {1,2,3,4,5}; // call by reference  för arrayer i java = skickar in orginalet till metoden.
		int b=3;                // call by value  för variabler i java  = skickar in en kopia till metoden.

		summa(i,b);
		System.out.println(Arrays.toString(i));
		int svar =subtraktion(4,5);
		int svargågnger2= svar*2;
		System.out.println(svar);
	}

	public static void summa(int [] a, int b ){

		System.out.println(a[2]+b);
		a[0]=1000;

	}

	public static int subtraktion(int j, int k) {


		return j-k ;


	}





}
