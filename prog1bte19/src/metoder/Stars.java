package metoder;

public class Stars {


	public static void main(String[] args) {


		starsPattern(2,5);

	}

	private static void starsPattern(int i, int j) {


		for(int f=0; f<i; f++){
			for(int k=0; k<j;k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}






}
