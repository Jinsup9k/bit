package for_while_dowhile;

public class DoWhileTest {
	public static void main(String[] args) {
		int a = 0;

		do {
			a++;
			System.out.print(a + " ");
		} while (a < 10);

		// A~Z 까지 출력 하되 한줄에 7개씩 출력하시오
		char ch = 'A';
		int count = 0;
		do {
			++count;
			System.out.print(ch + " ");
			++ch;
			if (count % 7 == 0)
				System.out.println();
		} while (ch <= 'Z');

	}
}
