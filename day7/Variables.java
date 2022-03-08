package day7;

public class Variables {
	
	  static int i = 20; //global we can 
	
	public static void main(String[] args) {
		
		
		int i = 10; //local variable
		
		 if(i==10) {
			 int j = 20; // local variable
			System.out.println(i);
			System.out.println(j);
			Variables obj = new Variables();
			obj.print();
		 }
		
		
	}
	
	public void print() {
		System.out.println(i);	
		int k = 3;
		if(i>2) {
			System.out.println(i);
			System.out.println(k);
		}
	}

	
	
	
	 
}
