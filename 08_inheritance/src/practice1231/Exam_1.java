package practice1231;

import java.util.Scanner;

public class Exam_1 {
	private String name, dap;
	private char[] ox;
	private int score;
	private final String JUNG = "11111";// public static final �� �ɾ����

	public Exam_1() {
		Scanner scan = new Scanner(System.in);
		ox = new char[5];

		System.out.print("�̸� �Է� : ");
		name = scan.next();
		System.out.print("�� �Է� : ");
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
