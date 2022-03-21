package march21;

public class Program4 {
	public static void main(String[] args) {

		String s1 = "Akhil";
		String s2 = "Sudheer";
		String s3 = "x";
		String result = printNames(s1, s2, s3);
		System.out.println(result);
		
		/*
		 * System.out.println("Akhil"); System.out.println("Sudheer");
		 */
	}

	public static String printNames(String s1, String s2, String s3) { // paramerter or arguments
		return (s1 + " " + s2 + " " + s3);
	}

}
