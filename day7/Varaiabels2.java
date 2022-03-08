package day7;

public class Varaiabels2 {

	public static void main(String[] args) {
		
		//implicit casting ( cast down) 
		
		int i = 3;
		
		float u = i/10;
		System.out.println(u);
		
		long l = i;
		
		System.out.println("The value is: "+ (i+20));
		
		System.out.println("the value is \t"+i); //new line //tab space back slash '\'
		
		String c = "\u00FD \u00FD \u00FD \u00FD \u00FD \u00FD"; 
		
		
		System.out.println(c);
		
		//explicit casting (cast up)
		byte b = 127;
		
		
		int x = b;
		System.out.println(x);
		System.out.println("\\");
		
		// + , *,- ,/, % == /equals operator
		//= assignment operator 
		
		
	}
}
