package instance;

public class Variable {
	public static void main(String[] args) {
		// �޸� �Ҵ�
		boolean a;
		char b;
		char c;
		int d = 65;
		int e = 'A';
		int f = (int)25L; // 25l - long ��
		//float g = 43.8; �Ǽ� ���� default ��  double�̴�
		float g = 43.8f;
		
		a = true;
		b = 'A';
		c = 65;

		// c = 65536; - int ���̱⿡ error(char = 65535���� )

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
	}
}