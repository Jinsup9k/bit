package nested;

import nested.Outer.Inner;

public class Outer {// Outer는 Inner를 접근하지 못함(객체를 생성하면 접근 가능)
	private String name;

	public void output() {
		Inner i = new Inner();
		System.out.println("이름 = " + name + "나이 = " + i.age);
	}

	class Inner {// Inner는 Outer를 맘대로 접근 가능
		private int age;

		public void disp() {
			System.out.println("이름 = " + Outer.this.name + " " + "나이 = " + age);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "홍길동";
		System.out.println("이름 = " + outer.name);

		Outer.Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();

		Outer.Inner inner2 = outer.new Inner();
		outer.name = "코난";
		inner2.age = 30;
		inner2.disp();

		Outer.Inner inner3 = new Outer().new Inner();
		// inner3.name = "또치"; 오류 - static을 거쳐서 나와서 오류
		inner3.age = 35;
		inner3.disp();
	}
}
