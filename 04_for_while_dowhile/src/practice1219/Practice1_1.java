package practice1219;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Math.random() * 3 + 1;
		int user;
		int com = (int)r;
		int sic = 1;
		int roc = 2;
		int pap = 3;

		// ���������� ���� ����
		// user�κ��� �Է¹ް� ��ǻ�Ϳ� ��ǻ�Ϳ� ���� ���� ����Ѵ�.
		System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
		user = Integer.parseInt(br.readLine());
		System.out.println("��ǻ�� : "+com+"\t  �� : "+user);

		
	}
}
