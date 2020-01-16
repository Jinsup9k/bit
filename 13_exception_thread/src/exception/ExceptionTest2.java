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

		System.out.print("���ϴ� ���� �Է��ϼ��� : ");
		dan = Integer.parseInt(br.readLine());

		System.out.println("-------------------");
	}

	public void output() {
		if (dan >= 2 && dan <= 9) {
			
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			// System.out.println("2~9������ �Է����ּ���");
			// �����ڰ� ������ Exception �߻�
			try {
				// throw new Exception("�����ʰ�(2~9������ �Է����ּ���)");
				throw new MakeException("�����ʰ�(2~9������ ����)");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
