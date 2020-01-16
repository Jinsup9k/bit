package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�̸�, ����, ����, ������ �Է� �޾Ƽ� ����, ����� ���Ͻÿ�
//������ calcTot() �̿�
//����� calcAvg() �̿�

public class MethodTest3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		MethodTest3 methodTest3 = new MethodTest3();
		
		System.out.println("==================");
		// �̸� �Է�
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = bufferedReader.readLine();

		// ���� �Է�
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor = Integer.parseInt(bufferedReader.readLine());

		// ���� �Է�
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng = Integer.parseInt(bufferedReader.readLine());

		// ���� �Է�
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math = Integer.parseInt(bufferedReader.readLine());

		// ����, ��� ���
		int tot = methodTest3.calcTot(kor, eng, math);
		double avg = methodTest3.calcAvg(tot);
		System.out.println("==================");
		//�����
		System.out.println("\t***** "+name+"����ǥ  ***** \t");
		System.out.println("-����-\t-����-\t-����-\t-����-\t-���-");
		System.out.println("  "+kor+"\t  "+eng+"\t  "+math+"\t  "+tot+"\t"+String.format("%.2f", avg));
		
	
	}

	public int calcTot(int k, int e, int m) {
		return k + e + m;
	}
	public double calcAvg(int t) {
		final double SUBJECT = 3.0;
		return t/SUBJECT;		
	}

}
