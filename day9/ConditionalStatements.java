package day9;

public class ConditionalStatements {
public static void main(String[] args) {
	
	// even or a odd 
	
	//if statements 
	/*
	Boolean greeting = false;
	
	if(greeting)
	System.out.println("hello");
	
	if(!greeting)
	System.out.println("bye"); */
	
	int i = 101; // 7/2 =3  7%2 != 0
	
	/*if(i%2 == 0)
	System.out.println("Even");
	else
	System.out.println("Odd"); */
	/*
	if(i == 0) {
	System.out.println("NA"); 
	System.out.println("another text"); }
	else if(i%2 == 0) {
		System.out.println("Even"); }
	else {
			System.out.println("Odd");
	
	}*/
	
	int x = 50; //even or odd and 
	///multiple of 10 or not
	// 5 10 15 20
	
	if(x%5 == 0) {
		System.out.println("divisible by 5");
		
		if(x%10 == 0) {
			System.out.println("divisible by 10");
		}
		
	}
	else {
		System.out.println("Not divisible by 5");
	}
	
	//nested statements 20 programs
	 
	
	
}
}
