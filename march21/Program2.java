package march21;

public class Program2 {
public static void main(String[] args) {
	
	
	//0  1  1  2  3  5  8 13 21
	
	int n1=0,n2=1,n3;
	System.out.print(n1+" "+n2);
	int count = 10;
	for(int i = 0 ;i<count-2;i++) {
		n3 = n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
	}
	
	
}
}
