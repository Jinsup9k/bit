package Practice0102;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	Scanner scan = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	private int year, month;

	public CalendarTest() {

		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
		calendar.set(year, month - 1, 1);
	}

	public void calculator() {
		int end = calendar.getActualMaximum(Calendar.DATE);
		int start = calendar.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i <= end; i++) {
			if (i == 1) {
				for (int j = 1; j < start; j++) {
					System.out.print("    ");
				}
			}
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");
			if (start % 7 == 0) {
				System.out.println();
			}
			start++;
		}

	}

	public void disp() {
		System.out.println("---------------------------");
		System.out.println("sun mon tue wed thr fri sat");
		System.out.println("---------------------------");
	}

}
