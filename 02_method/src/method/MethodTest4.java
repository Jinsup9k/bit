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
public class MethodTest4 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		MethodTest4 m4 = new MethodTest4();

		// �Է�â
		System.out.print("�̸� �Է� : ");
		String name = bf.readLine();
		System.out.print("�ֹι�ȣ �Է�(000000-0000000) : ");
		String id = bf.readLine();

		// ����
		String gender = m4.gen(id.charAt(7)) ? "����" : "����";

		// ����
		int age = m4.calcAge(id); 
		
		// ���� ���
		System.out.printf(name+"���� "+gender+"�̰� "+age+"�� �Դϴ�.");
	}

	public boolean gen(char id) {// ���� ���� 1:49
		return id % 2 != 0 ? true : false;
	}
	public int calcAge(String id) {
		//�ֹι�ȣ �� ���ڸ��� ����� �� �ְ� int�� �ٲ��ش�
		int num = Integer.parseInt(id.substring(0, 2));
		//���� �� ���ڰ� 20���� ũ�ų� ������ 1900���� ������ 2000���� ���뿡 ���� ������ ����
		//����:1900����� �̰ڴ�
		int age = num >= 20 && num < 100 ? 2019-(1900+num)+1:2019-(2000+num)+1; 
		
		return age;
	}
}
