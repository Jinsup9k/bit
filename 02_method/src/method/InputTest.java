package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//����� ��Ʈ��
//BufferedReader,Scanner 
public class InputTest {
// Ű���带 ���ؼ� ������ ������ Ÿ���� InputStream �̴�
	public static void main(String[] args) throws IOException {
		// BufferedReader�� �̿��� �Է°� ����ȯ�ؼ� ����ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = br.readLine();
		System.out.println(str);

		System.out.print("������ �Է��ϼ��� : ");
		int i = Integer.parseInt(br.readLine());
		System.out.println(i);

		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);

	}
}

//Exception (���� ó��)
//BufferedReader�� �̿��Ҷ� ���  throws IOException�� ���Ͽ� �۾��Ѵ�.
//try & catch �� Ȱ���Ͽ� ����ó���� �ϱ⵵������()