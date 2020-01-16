package class_2;

public class StringTest {

	public static void main(String[] args) {
		String a = "apple";// literal 생성
		String b = "apple";// 두개의 주소값이 같음 Single tone개념
		if (a == b)
			System.out.println("같다");
		else
			System.out.println("다르다");
		if (a.equals(b))
			System.out.println("같다");
		else
			System.out.println("다르다");
		// Single tone = 1.new 는 한번만 2. static 영역
		// Spring 은 기본이 Single tone

		String c = new String("apple");// 두 개의 주소값이 다름
		String d = new String("apple");
		if (c == d)
			System.out.println("같다");
		else
			System.out.println("다르다");
		if (c.equals(d))
			System.out.println("같다");
		else
			System.out.println("다르다");

		String e = "오늘 날짜는 " + 2019 + 12 + 30;
		System.out.println("e" + e);

		// 문자열은 편집이 안되므로 메모리 4번 생성된다
		// JVM 에 의해서 삭제시 Garbage Collector 로 보낸다.
		// Garbage Collector가 실행되면 컴퓨터는 멈춘다.
		// " 오늘 날짜는 "
		// 오늘 날짜는 2019 - 오늘날짜는 201912 - 오늘 날짜는20191230

		System.out.println("문자열 크기 = " + e.length());

		for (int i = 0; i < e.length(); i++) {
			System.out.println(i + " : " + e.charAt(i));
		}
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11));

		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());

		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));// 시작 위치를 알려줌
		System.out.println("문자열 검색 = " + e.indexOf("개바부"));// 없는 글자는 -1

	}

}
