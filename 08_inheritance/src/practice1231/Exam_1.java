package practice1231;

import java.util.Scanner;

public class Exam_1 {
	private String name, dap;
	private char[] ox;
	private int score;
	private final String JUNG = "11111";// public static final 로 걸어야함

	public Exam_1() {
		Scanner scan = new Scanner(System.in);
		ox = new char[5];

		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("답 입력 : ");
		dap = scan.next();
		System.out.println();
	}

	public void compare() {
		for (int i = 0; i < dap.length(); i++) {
			if (dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			} else {
				ox[i] = 'X';
			}
		}

	}

	public String getName() {
		return name;
	}

	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
}
