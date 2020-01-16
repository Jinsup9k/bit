package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;

	public static void main(String[] args) throws IOException {
		ExceptionTest2 e2 = new ExceptionTest2();
		e2.input();
		e2.output();
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("원하는 단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());

		System.out.println("-------------------");
	}

	public void output() {
		if (dan >= 2 && dan <= 9) {
			
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			// System.out.println("2~9까지만 입력해주세요");
			// 개발자가 강제로 Exception 발생
			try {
				// throw new Exception("범위초과(2~9까지만 입력해주세요)");
				throw new MakeException("범위초과(2~9까지만 가능)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
