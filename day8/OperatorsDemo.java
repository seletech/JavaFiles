package day8;

public class OperatorsDemo {

	public static void main(String[] args) {
	
		//operand operator expression
		
		int i = 10;  // java tokens 
		
		
		//System.out.println(20+30);
		//unary operator 
		int x = 20; //20
		//System.out.println(++x); // ++x x++ //21 //20
		//System.out.println(x); //21
		
		int y = 20;
		//System.out.println(--y); //20
		//System.out.println(y); //19
		//~
		
		int z = 20;//including 0
		//System.out.println(~z); //-(-x+1) // positive numbers
		
		
		//(10<<3);//10*2^3) 
		//shift operator
		
		System.out.println(20<<4);  // 10100
									// 101000000 320
		//(20>>3);//20/2^3
		System.out.println(20>>3); // 10100
									//10
		//System.out.println(320>>4); // 20  
		//101000000
		//10100
		
		//binary operator
		//comparesion or relational operators
				
		
		//System.out.println(!(5>4)); // > < >= <= == 
		//!= 
		int a = 5;
		System.out.println(x%=5);
		
		//arthmetic operators
		//+ - * / %(moduls operator)
		
		//System.out.println(21%7);
		
		System.out.println(false || false); //and
		
	}

}
