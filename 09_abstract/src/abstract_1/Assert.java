package abstract_1;

import java.util.Scanner;

//assert - run as - run confi.. - args
public class Assert {
	private int x, y;

	public static void main(String[] args) {
		Assert as = new Assert();
		as.input();
		as.output();
	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.print("x값 입력 : ");
		x = scan.nextInt();
		System.out.print("y값 입력 : ");
		y = scan.nextInt();

	}

	public void output() {
		assert y >= 0 : "y는 0보다 크거나 같아야 한다.";

		int mul = 1;

		for (int i = 0; i < y; i++) {
			mul *= x;
		}
		System.out.println(x + "의 " + y + "승은" + mul);
	}

}
