package metoder;

public class Derivata {



	public static void main(String[] args) {


		derivera(2,2,4);

		//derivera("2+2x+x4");

		//2+4x^3

	}





	public static void derivera(int konstant, int x, int xraisedTo ){


		String firstDerivata= x+"+"+xraisedTo+"x^"+(xraisedTo-1);


		System.out.println(firstDerivata);




	}




}
