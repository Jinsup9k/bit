package abstract_1;

import java.util.Scanner;

abstract class ShapeTest {
	protected Scanner scan = new Scanner(System.in);
	protected double area;

	public ShapeTest() {
		System.out.println("ShapeTest 기본 생성자");
	}

	public abstract void calcArea();

	public abstract void dispArea();
}

class SamTest extends ShapeTest {
	private int base, height;

	public SamTest() {
		System.out.println("SamTest 기본 생성자");
		System.out.print("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
	}

	@Override // annotation : 골뱅이 주석
	public void calcArea() {
		area = base * height / 2.0;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("삼각형 넓이 = " + area);
	}
}

class SaTest extends ShapeTest {
	private int width, height;

	public SaTest() {
		System.out.println("SaTest 기본 생성자");
		System.out.print("가로 : ");
		width = scan.nextInt();
		System.out.print("세로 : ");
		height = scan.nextInt();
	}

	@Override // annotation : 골뱅이 주석
	public void calcArea() {
		area = width * height;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("사각형 넓이 = " + area);
	}

}

class SadariTest extends ShapeTest {
	private int top, bottom, height;

	public SadariTest() {
		System.out.println("SadariTest 기본 생성자");
		System.out.print("윗변 : ");
		top = scan.nextInt();
		System.out.print("밑변 : ");
		bottom = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();

	}

	@Override // annotation : 골뱅이 주석
	public void calcArea() {
		area = (top + bottom) * height / 2.0;
	}

	@Override
	public void dispArea() {
		calcArea();
		System.out.println("사다리꼴 넓이 = " + area);
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

		ShapeTest ss; // 부모는 만능 리모컨 으로 생각 하면 됨~`
		ss = new SamTest();// 결합도 낮추기 , 부모는 자식 클래스를 참조 할 수 있따. 부모 = 자식
		ss.dispArea(); // 자식은 부모를 참조 할 수 없다. 자식 = (자식)부모 ''''다운캐스팅 해야함
		System.out.println();

		ss = new SaTest();
		ss.dispArea();
		System.out.println();

		ss = new SadariTest();
		ss.dispArea();
		System.out.println();

	}
}
