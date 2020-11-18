package loopar;

public class ovn84 {

	public static void main(String[] args) {

		int []arr= {23,56,3,78,89,2};
		int max=Integer.MIN_VALUE;


		for (int i = 0; i < arr.length; i++) {


			if (arr[i]>max) {

				max= arr[i];

			}

		}
			System.out.println(max);
	}


}
