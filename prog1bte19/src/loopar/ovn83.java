package loopar;

import java.util.Arrays;

public class ovn83 {

	public static void main(String[] args) {

		int [] meterPerSekund= new int [8];

		int i=0;

		while(i<8) {

			meterPerSekund[i]=5 *(i+1);
			System.out.println(Arrays.toString(meterPerSekund));
			i++;

		}
		System.out.println("m/s\t km/h");
		for(int k=0;k<8; k++) {

			System.out.print(meterPerSekund[k]+"\t ");
			System.out.println(meterPerSekund[k]*3.6);
		}






	}

}
