package abstract_1;

import java.util.Scanner;

abstract class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	protected double area;

	public ShapeTest() {
		System.out.println("ShapeTest �⺻ ������");
	}

	public abstract void calcArea();

	public abstract void dispArea();
}

class SamTest extends ShapeTest {
	private int base, height;

	public SamTest() {
		System.out.println("SamTest �⺻ ������");
		System.out.print("�غ� : ");
		base = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}

	@Override // annotation : ����� �ּ�
	public void calcArea() {
		area = base * height / 2.0;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("�ﰢ�� ���� = " + area);
	}
}

class SaTest extends ShapeTest {
	private int width, height;

	public SaTest() {
		System.out.println("SaTest �⺻ ������");
		System.out.print("���� : ");
		width = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();
	}

	@Override // annotation : ����� �ּ�
	public void calcArea() {
		area = width * height;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("�簢�� ���� = " + area);
	}

}

class SadariTest extends ShapeTest {
	private int top, bottom, height;

	public SadariTest() {
		System.out.println("SadariTest �⺻ ������");
		System.out.print("���� : ");
		top = scan.nextInt();
		System.out.print("�غ� : ");
		bottom = scan.nextInt();
		System.out.print("���� : ");
		height = scan.nextInt();

	}

	@Override // annotation : ����� �ּ�
	public void calcArea() {
		area = (top + bottom) * height / 2.0;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("��ٸ��� ���� = " + area);
	}

}

//---------------
//---------------
//---------------
//---------------
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sm = new SamTest();
//		sm.dispArea();
//		System.out.println();
//
//		SaTest sa = new SaTest();
//		sa.dispArea();
//		System.out.println();
//
//		SadariTest sd = new SadariTest();
//		sd.dispArea();
//		System.out.println();

		ShapeTest ss; // �θ�� ���� ������ ���� ���� �ϸ� ��~`
		ss = new SamTest();// ���յ� ���߱� , �θ�� �ڽ� Ŭ������ ���� �� �� �ֵ�. �θ� = �ڽ�
		ss.dispArea(); // �ڽ��� �θ� ���� �� �� ����. �ڽ� = (�ڽ�)�θ� ''''�ٿ�ĳ���� �ؾ���
		System.out.println();

		ss = new SaTest();
		ss.dispArea();
		System.out.println();

		ss = new SadariTest();
		ss.dispArea();
		System.out.println();

	}
}
