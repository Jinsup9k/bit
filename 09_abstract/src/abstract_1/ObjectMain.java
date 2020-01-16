package abstract_1;

/*
class Object {
		public boolean equals(Object ob){}// 참조값 비교 
		public String toSting(){} // 클래스@ 16진수
		public int hashCode(){} // 10진수 
	}
class String extends Object{
	public boolean equals(Object ob){}// 스트링 클래스만 문자열 비교
	public String toString(){} // 문자열
	public int hashCode(){} // int 21 억 <문자열 (무한) 신빙성 부족
 */

class Test extends Object {
	@Override
	public String toString() {
		return getClass() + "@개바부";
	}
}

public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode());// 주소 값을 10진수로 바꿔줌 - 두 객체가 같은 객체인지 확인하는 메소드
		System.out.println();

		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());// 주소 값을 10진수로 바꿔줌 - 두 객체가 같은 객체인지 확인하는 메소드
		System.out.println();

		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa == bb : " + (aa == bb));// f
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); // t
		System.out.println();

		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc == dd : " + (cc == dd)); // 참조값 - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd));// false
		System.out.println();

		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee == ff : " + (ee == ff));// f 참조값
		System.out.println("ee.equals(ff) : " + ee.equals(ff)); // t 문자열
		System.out.println();

	}
}
