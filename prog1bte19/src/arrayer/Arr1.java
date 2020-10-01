package arrayer;

import java.util.Arrays;

public class Arr1 {


	public static void main(String[] args) {

		double[] b= {34,56,3.4,66,77,77,99};
		int[] a= new int[10];

//		a[0]=5;
//		a[1]=6;
//		a[2]=20;
//		a[9]=10;

		/*
		for(startvärde;vilkorsvärde;förändringvärde) {

		}
		*/
		for(int i=0;i<10;i=i+1) {
			a[i]=i;
			//System.out.println(a[i]);
		}

		System.out.println(Arrays.toString(a));
		System.out.print(Arrays.toString(b));


	}




}
