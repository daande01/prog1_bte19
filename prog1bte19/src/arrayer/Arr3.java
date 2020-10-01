package arrayer;

import java.util.Arrays;

public class Arr3 {
	public static void main(String[] args) {

		int[] a= {0,1,2,3,4,5,6,7,8,9};
		int[] b= {0,1,2,3,4,5,6,7,8,9};

		int[] c = new int[10];


		for (int i = 0; i < c.length; i++) {

			c[i]=a[i]+b[i];

		}
		System.out.println(Arrays.toString(c));




	}
}
