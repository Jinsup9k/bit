package practice1217;
//�빮�� 65 - 90
//�ҹ��� 97 - 122

public class Practice6 {
	public static void main(String[] args) {
		char ch = 97;

		int result = ch < 97 ? ch + 32 : ch - 32;

		System.out.println(ch + "->"+(char)result);
	}
}
