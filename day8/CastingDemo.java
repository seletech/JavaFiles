package day8;

public class CastingDemo {

	public static void main(String[] args) {
		//casting
		
		//implicit 
		byte b = 120;
		
		int i = b; // byte -> integer (1byte -> 4bytes)
		
		int i1 = 100;
		
		//explicit
		byte b1 = (byte) i1;  // integer -> byte ( 4 byte -> 1byte) data loss
		
		
		float pi = 3.143234243242f;
		System.out.println(pi);
		int j = (int) pi;  // float -> int data loss
		System.out.println(j);
		
		double d = pi;
		System.out.println(d);
	
	//	(implicit (Widening) (casting down),
		//explicit(narrow) (casting up)
		
		
		

	}

}
