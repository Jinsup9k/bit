package practice1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//�������� �Է� ����
		System.out.print("10������  �Է��ϼ��� : ");
		int dec = Integer.parseInt(bf.readLine());
		
		//��ȯ �� ���
		System.out.println("2 ���� = "+Integer.toBinaryString(dec));
		System.out.println("8 ���� = "+Integer.toOctalString(dec));
		System.out.println("16 ���� = "+Integer.toHexString(dec));
		// Integer.to~~~String �Լ��� �̿��ϸ� ������� String���� �������
	}
}
