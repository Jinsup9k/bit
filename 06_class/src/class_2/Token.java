package class_2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "�п�,��,,���ӹ�";

		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("��ū ���� = "+ st.countTokens());
		
		while(st.hasMoreTokens()) {//��ū�� �ִ�, ����!
			System.out.println(st.nextToken());//��ū ������ �������� �̵��ϸ�
		}
		System.out.println();//
		String[] ar = str.split(",");//���鵵 üũ��
		for(String data : ar) {
			System.out.println(data);
		}
	}
	
	
}
