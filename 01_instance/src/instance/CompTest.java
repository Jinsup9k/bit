package instance;

//���ǿ�����(���׿�����)
public class CompTest {
	public static void main(String[] args) {
		int score = 10;
		int b = 80;
		
		String result = score >= 80 && score <= 100 ? "�հ�" : "���հ�";
		System.out.println("��� = " + result);
		
		result = score%2 == 0 ? "¦��": "Ȧ��";
		System.out.println("��� = " + result);
		
		result = score - b > 0 ? score+"" : b+"";// �ڿ� ���̸� StringŸ������ ��ȯ
		System.out.println("ū �� ="+ result);
	}
}
