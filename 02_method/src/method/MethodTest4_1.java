package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�̸��� �ֹε�Ϲ�ȣ�� �Է��Ͽ� ������ ��� �Ͻÿ�
 * ���� �����Ҷ��� comp()�޼ҵ�� ���̸� ����ϴ� calcAge()�� �̿��� �ۼ��Ͻÿ� 
 * [������]
 * �̸� �Է�: ȫ�浿
 * �ֹι�ȣ �Է� : 001023-1123456
 * 
 * ȫ�浿���� �����̰� 20�� �Դϴ�*/
public class MethodTest4_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4_1 m = new MethodTest4_1();

		System.out.print("�̸� �Է� : ");
		String name = b.readLine();
		System.out.print("�ֹι�ȣ �Է� : ");
		String id = b.readLine();

		// ����
		String gender = m.comp(id);
		// ����
		int age = m.calcAge(id);
		//���
		System.out.println(name+"����"+gender+"�̰�"+age+"�Դϴ�.");
	}

	private int calcAge(String id) {
		int year = Integer.parseInt(id.substring(0, 2));
		char g = id.charAt(7);
		year += (g=='1'|| g=='2'? 1900 : 2000);
		int age = 2019 - year +1;
		return age;
	}

	public String comp(String id) {
		return id.charAt(7) == '1' || id.charAt(7) == '3' ? "����" : "����";
	}
}
