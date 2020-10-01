package arrayer;

import java.util.Arrays;

public class Swap {
	public static void main(String[] args) {


		int []i = {4,5};


		int temp=i[0];  // lagra nu 4

		i[0]=i[1]; //lagrar 5 på plats 0
		i[1]=temp; // lagrar 4 på plats 1

		System.out.println(Arrays.toString(i) );





	}
}
