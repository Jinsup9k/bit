package practice1217;

public class Practice3 {
	public static void main(String[] args) {
		String name ="L";// char name = 'L';
		int basePay = 2500000;
		double tax = 0.033;
		
		System.out.println("*** "+name+"�� ���� ***");
		System.out.println("�⺻�� :"+basePay+"��");
		System.out.println("����   :"+(int)(basePay*tax)+"��");
		System.out.println("����   :"+(basePay-(int)(basePay*tax))+"��");
	}
}
