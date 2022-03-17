package march17;

public class SwitchBreakContinue {

	public static void main(String[] args) {

		int x = 10, y = 20;
		String action = "rem";

		switch (action) {
		case "add":
			System.out.println(x + y);
			break;
		case "mul":
			System.out.println(x * y);
			break;
		case "sub":
			System.out.println(x - y);
			break;
		case "div":
			System.out.println(x / y);
			break;
		case "rem":
			System.out.println(y % x);
			break;
		default:
			System.out.println("No matching action");
		}

		// continue break

		int j = 1;
		while (j <= 10) {
			if (j == 5) {
				System.out.println("*");
				break;
			}
			System.out.print(j);
			j++;
			
		}
		// 1 2 3 4 * 
		//
		
		
		/*
		 * for(int i=1;i<11;i++) { if(i==5) { System.out.println("*"); continue; }
		 * 
		 * System.out.println(i); } System.out.println();
		 * 
		 */
	}

}
