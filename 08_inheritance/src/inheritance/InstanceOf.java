package inheritance;

class AAA {

}

class BBB extends AAA {

}

public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA();
		BBB bb = new BBB();
		AAA aa2 = new BBB();

		AAA aa3 = aa;

		if (aa instanceof AAA)// 형변환 되는지 안되는지 객체에 원하는 클래스타입이 메모리 할당되었는지 안되었는지
			System.out.println("1.된다");
		else
			System.out.println("1.안된다");

		AAA aa4 = bb;
		if (bb instanceof AAA)
			System.out.println("2.된다");
		else
			System.out.println("2.안된다");

		// BBB bb2 = (BBB) aa; - 자식 =(자식)부모 해야함

		if (aa instanceof BBB)
			System.out.println("3.된다");
		else
			System.out.println("3.안된다");

		BBB bb3 = (BBB) aa2;// 위에껀 안된다 . 위에 건 클래스 생성 조차 안되어있다

		if (aa2 instanceof BBB)
			System.out.println("4.된다");
		else
			System.out.println("4.안된다");
	}
}
