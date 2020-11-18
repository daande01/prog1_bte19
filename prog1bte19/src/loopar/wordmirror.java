package loopar;

public class wordmirror {

	public static void main(String[] args) {


		String ord="paris";
		String backWards="" ;

		for (int i =ord.length()-1 ; i >=0; i--) {


		backWards=backWards + ord.charAt(i);


		}

		System.out.print(backWards);






	}
}
