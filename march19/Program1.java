package march19;

public class Program1 {
public static void main(String[] args) {
	
	//factorial
	//1! = 1 2!= 2 (1*2) 3! (3*2*1) = 6 
	//5! = 5*4*3*2*1 mult
	//1 2 3 4 5 
	// 5 4 3 2 1 addition 15
	
	int result = 1; // initalization
	for(int i=5;i>=1;i--) {
		result = result * i;	 //0+5 5+4 9+3 12+2 14+1
								//1*5 5*4 20*3 60*2 120*1
	}
	System.out.println(result);
}
}
