package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/*a값 입력 : 25
b값 입력 : 36
연산자 (+,-,*,/)입력 : +
25 + 36 = xx

실수 일때 소수점 3째 자리 까지
연산자 이상한거 넣으면 ? 연산자error*/
public class SwitchTest2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 : ");
		String op = br.readLine();

		// 스위치(연산자) 연산자 케이스 따라서 계산식
		// +75 -77 *74 /79
		switch (op) {
		case ("+"):
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case ("-"):
			System.out.println(a + " - " + b + " = " + (a + b));
			break;
		case ("*"):
			System.out.println(a + " * " + b + " = " + (a + b));
			break;
		case ("/"):
			// System.out.println(a + " / " + b + " = " + String.format("%.3f", (double) a +
			// b ));
			// #으로 하면 유효하지 않은 숫자 는 추력하지 않음
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a + " / " + b + " = " + df.format(a + b));
			break;
		default:
			System.out.println("연산자 error");

		}

	}
}
