package for_while_dowhile;

public class ForTest5_Sum {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for (i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print("+"+i);
				sum += i;
			} else {
				System.out.print("-"+i);
				sum -= i;
			}
		}
		System.out.println("="+sum);
	}
}
