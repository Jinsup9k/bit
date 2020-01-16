package inheritance;

class AA {
	public int a = 3;

	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}

class BB extends AA {
	public int a = 8;

	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}

public class TestMain2 {

	public static void main(String[] args) {
		BB bb = new BB();
		bb.disp();
		System.out.println(bb.a + " ");
		System.out.println();
		// 변수는 오버라이드 개념이 없다.
		AA aa = new BB();// 부모는 자식 참조 가능 -- 부모 = 자식
		aa.disp();
		System.out.println(aa.a + " ");
		
		BB bb2 = (BB)aa; // 자식 = (자식) 부모
		System.out.println(bb2.a + " ");
	}
}
