package inheritance;

class AAA {

}

class BBB extends AAA {

}

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB();

		AAA aa3 = aa;

		if (aa instanceof AAA)// ����ȯ �Ǵ��� �ȵǴ��� ��ü�� ���ϴ� Ŭ����Ÿ���� �޸� �Ҵ�Ǿ����� �ȵǾ�����
			System.out.println("1.�ȴ�");
		else
			System.out.println("1.�ȵȴ�");

		AAA aa4 = bb;
		if (bb instanceof AAA)
			System.out.println("2.�ȴ�");
		else
			System.out.println("2.�ȵȴ�");

		// BBB bb2 = (BBB) aa; - �ڽ� =(�ڽ�)�θ� �ؾ���

		if (aa instanceof BBB)
			System.out.println("3.�ȴ�");
		else
			System.out.println("3.�ȵȴ�");

		BBB bb3 = (BBB) aa2;// ������ �ȵȴ� . ���� �� Ŭ���� ���� ���� �ȵǾ��ִ�

		if (aa2 instanceof BBB)
			System.out.println("4.�ȴ�");
		else
			System.out.println("4.�ȵȴ�");
	}
}
