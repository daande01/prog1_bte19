package text;

public class String1 {

	public static void main(String[] args) {


		String ord1;
		String ord2="d�";

		ord1 = "hej " + ord2+ord2;

		System.out.println(ord1);

		int l�ngd =ord2.length();

		System.out.println(l�ngd);

		char ettTecken=ord2.charAt(0);
		System.out.println(ettTecken);

		String mening ="idag �r det fint v�rder minus 10 grader";
		String part= mening.substring(24);
		String part2= mening.substring(4,6);

		System.out.println(part2);




	}


}
