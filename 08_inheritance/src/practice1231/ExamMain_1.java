package practice1231;

import java.util.Scanner;

public class ExamMain_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("인원수를 입력 : ");
		int people = scan.nextInt();

		Exam_1[] e = new Exam_1[people];
		for (int i = 0; i < people; i++) {
			e[i] = new Exam_1();
			e[i].compare();
		}

		System.out.println("이름\t1 2 3 4 5\t점수");
		for (int i = 0; i < people; i++) {
			System.out.print(e[i].getName() + "\t");

			for (int j = 0; j < e[i].getOx().length; j++) {
				System.out.print(e[i].getOx()[j] + " ");
			}
			System.out.println("\t" + e[i].getScore());
		}
	}
}
