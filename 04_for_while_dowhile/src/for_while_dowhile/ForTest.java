package for_while_dowhile;

public class ForTest {
	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <= 10; i++) {
			System.out.println("hello" + i);
		}
		System.out.println("Å»Ãâ i = " + i);
		System.out.println("");

		//
		for (i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		// A B C ,,
		for (i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		}
	}

}
