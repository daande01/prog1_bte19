package text;

public class String1 {

	public static void main(String[] args) {


		String ord1;
		String ord2="då";

		ord1 = "hej " + ord2+ord2;

		System.out.println(ord1);

		int längd =ord2.length();

		System.out.println(längd);

		char ettTecken=ord2.charAt(0);
		System.out.println(ettTecken);

		String mening ="idag är det fint värder minus 10 grader";
		String part= mening.substring(24);
		String part2= mening.substring(4,6);

		System.out.println(part2);




	}


}
