package array;

public class MultiArray4 {
	public static void main(String[] args) {
		int[][] jumsu = { { 90, 95, 100, 0 }, { 100, 89, 75, 0 }, { 75, 80, 48, 0 } };
		String[] name = { "홍길동", "코난", "또치" };
		double[] avg = new double[3];
		char[] grade = { 'A', 'B', 'C', 'D', 'F' };
		int i, j;

		// 실행
		System.out.println("---------------------------------------------------");
		System.out.println("이름 \t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");

		// 입력
		for (i = 0; i < jumsu.length; i++) {
			for (j = 0; j < jumsu[i].length - 1; j++) {
				jumsu[i][3] += jumsu[i][j];
				avg[i] = jumsu[i][3] / 3.0;
			}
		}
		for (i = 0; i < jumsu.length; i++) {
			for (j = 0; j < jumsu[i].length; j++) {

				if (avg[i] >= 90) {
					grade[i] = 'A';
				} else if (avg[i] >= 80) {
					grade[i] = 'B';
				} else if (avg[i] >= 70) {
					grade[i] = 'C';
				} else if (avg[i] >= 60) {
					grade[i] = 'D';
				} else {
					grade[i] = 'F';
				}
			}
		}

		// 출력
		for (i = 0; i < jumsu.length; i++) {
			System.out.print(name[i]);
			for (j = 0; j < jumsu[i].length; j++) {
				System.out.print("\t" + String.format("%4d", jumsu[i][j]));
			}
			System.out.println("\t" + String.format("%.2f", avg[i]) + "\t " + grade[i]);
		}
	}
}
