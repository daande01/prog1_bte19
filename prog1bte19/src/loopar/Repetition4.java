package loopar;

public class Repetition4 {



	public static void main(String[] args) {

		//Repetition4.printHej();
		String sammansatt =särSkrivning("kanon" , "kula");
		System.out.println(sammansatt);

		int slump= slumpaHeltal();
		System.out.println(slump);

	}

	public static void printHej() {

		System.out.print("Hej");

	}

	public static String särSkrivning(String s1, String s2 ) {

		String s=s1+s2;

		return s;

	}
	public static int slumpaHeltal(){

		return (int) (Math.random()*10+1);

	}



}
