package practice1218;

public class Practice2 {
	public static void main(String[] args) {
		Practice2 p2 = new Practice2();
		//�ֻ�����
		int first = (p2.input() + 1);
		int second = (p2.input() + 1);
		//��
		int sum = p2.add(first,second);
		System.out.println("ù��° �ֻ��� �� : " + first);
		System.out.println("�ι�° �ֻ��� �� : " + second);
		System.out.println("���� "+ sum + "�̴�." );
	}

	public int input() {
		double r = Math.random() * 6;
		return (int) r;
	}
	public int add(int first, int second) {
		return first + second;
	}
}
