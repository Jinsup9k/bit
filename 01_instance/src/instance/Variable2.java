package instance;

/*��ȿ���� 	
 * */
public class Variable2 {
	int a; // field (����), �ʱ�ȭ ,instance ����
	static int b;// field, �ʱ�ȭ , Ŭ���� ����
	String str;
	static String str2;
	
	public static void main(String[] args) {
		int a = 10; // local variable(���� ����),(�����Ⱚ) �ݵ�� �ʱ�ȭ
		System.out.println("���� a=" + a);
		System.out.println("�ʵ� a=" + new Variable2().a);
		System.out.println("�ʵ� b=" + b);
		System.out.println("�ʵ� str=" + new Variable2().str);
		System.out.println("�ʵ� str2=" + str2);
	
	
	}
}
