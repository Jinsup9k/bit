package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";// literal ����
		String b = "apple";// �ΰ��� �ּҰ��� ���� Single tone����
		if (a == b)
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		if (a.equals(b))
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		// Single tone = 1.new �� �ѹ��� 2. static ����
		// Spring �� �⺻�� Single tone

		String c = new String("apple");// �� ���� �ּҰ��� �ٸ�
		String d = new String("apple");
		if (c == d)
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		if (c.equals(d))
			System.out.println("����");
		else
			System.out.println("�ٸ���");

		String e = "���� ��¥�� " + 2019 + 12 + 30;
		System.out.println("e" + e);

		// ���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�
		// JVM �� ���ؼ� ������ Garbage Collector �� ������.
		// Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����.
		// " ���� ��¥�� "
		// ���� ��¥�� 2019 - ���ó�¥�� 201912 - ���� ��¥��20191230

		System.out.println("���ڿ� ũ�� = " + e.length());

		for (int i = 0; i < e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}
		System.out.println("�κ� ���ڿ� ���� = " + e.substring(7));
		System.out.println("�κ� ���ڿ� ���� = " + e.substring(7, 11));

		System.out.println("�빮�� ���� = " + "Hello".toUpperCase());
		System.out.println("�ҹ��� ���� = " + "Hello".toLowerCase());

		System.out.println("���ڿ� �˻� = " + e.indexOf("¥"));
		System.out.println("���ڿ� �˻� = " + e.indexOf("��¥"));// ���� ��ġ�� �˷���
		System.out.println("���ڿ� �˻� = " + e.indexOf("���ٺ�"));// ���� ���ڴ� -1

	}

}
