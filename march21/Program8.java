package march21;

public class Program8 {

	public static int fact(int n) {
		int result=1;
		for(int i=n;i>=1;i--) {
			result = result*i;
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		int num = 6;
		System.out.println(fact(num));
		
	}
	
	
}
