package nested;

public class AbstractMain {

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {// <--- �͸� �̳�Ŭ����

			@Override
			public void setName(String name) {
			}
		};// �����ݷ� �� ����
		at.setName("ȫ�浿");
		System.out.println("�̸��� ? " + at.getName());

		InterA aa = new InterA() {// ���⼭ new�� �͸� �̳�Ŭ������ new���ִ� ��!
			@Override
			public void bb() {
			}

			@Override
			public void aa() {
			}
		};

		AbstractExam ae = new AbstractExam() {
		};
	}
}