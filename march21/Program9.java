package march21;

public class Program9 {
public static void main(String[] args) {
	short num = 31;
	int flag = evenOrOdd(num);
	System.out.println(flag);
}

//method overloadding
public static boolean evenOrOdd(int n) {
	if(n%2==0) return true;
	else return false;
}
public static boolean evenOrOdd(double n) {
	if(n%2==0) return true;
	else return false;
}
public static int evenOrOdd(short n) {
	if(n%2==0) return 1;
	else return 0;
}

}
