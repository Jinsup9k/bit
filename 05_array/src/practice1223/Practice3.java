package practice1223;

//�ζ�
public class Practice3 {
	public static void main(String[] args) {
		Practice3 p = new Practice3();
		int[] lotto = new int[6];

		p.input(lotto);
		p.output(lotto);

	}

	public void input(int[] lotto) {
		int i, j;

		for (i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 44 + 1);
			// �ߺ� ����
			for (j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
	}

	public void output(int[] lotto) {
		System.out.print("�ζ� ��ȣ��  ");
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		for (int n : lotto)
			System.out.print(n + " ");
		System.out.println("�Դϴ�.");
	}

}
