package method;

/*�޼ҵ� : ��ɾ���� ���� */
public class MethodTest {
	public static void main(String[] args) {
		int bigger = Math.max(23, 45);
		System.out.println("ū �� : " + bigger);

		int smaller = Math.min(22323, 23222);
		System.out.println("\n���� �� : " + smaller);

		double power = Math.pow(2., 5.);
		System.out.println("\n2�� 5���� " + (int) power + "�̴�.");

		// ���� - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻���Ű�� �� , 0.0 <= ���� < 1.0
		
		double r = Math.random() * 100;
		System.out.println("\n ���� : " + (int) r);
		// ���� ���� �Ҷ� ���ϴ� ���� �� �� + 1
		// '0' = 48
		
		System.out.println('2'+ '5');
		System.out.println('2'-48+ '5'-48);
	
		System.out.println("2"+ "5.7");
		System.out.println(Integer.parseInt("2")+Double.parseDouble("5.7"));
	
	}

}
