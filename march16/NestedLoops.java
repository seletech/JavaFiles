package javaclass;

public class NestedLoops {

	public static void main(String[] args) {
		
		
		for(int j=1;j<=4;j++) {
			//outer loop
			for(int i=1;i<=j;i++) { // 1 2 3 4
				//inner loop 
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
	}

	/*
	1
	12
	123
	1234 */

}

/*
 * 12345 
 * 12345 
 * 12345 
 * 12345
 */

