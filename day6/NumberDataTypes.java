package day6;

public class NumberDataTypes {
	public static void main(String[] args) {
			
		//number types
		//byte ,short ,int ,long ,float ,double 
		
		
		
		int maxIntegerValue = Integer.MAX_VALUE;
		int minIntegerValue = Integer.MIN_VALUE;
		System.out.println("range of int: ");
		System.out.println(maxIntegerValue);
		System.out.println(minIntegerValue);
		
		// from -2147483648 to 2147483647
		
		//overflying
		int newMax = maxIntegerValue+1;
		System.out.println(newMax);
		
		//underflying
		int newMin = minIntegerValue-1;
		System.out.println(newMin);
		
	}
}
