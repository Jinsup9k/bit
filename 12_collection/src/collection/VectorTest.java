package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		System.out.println("벡터 크기 = " + v.size());// 0
		System.out.println("벡터 크기 = " + v.capacity());// 기본 용량 10개 , 10개씩 증가
		System.out.println();

		System.out.println("항목 추가");
		for (int i = 0; i < 10; i++) {
			v.add(i + "");
		}

		System.out.println("벡터 크기 = " + v.size());// 10
		System.out.println("벡터 크기 = " + v.capacity());// 10
		System.out.println();

		v.add(5 + "");
		System.out.println("벡터 크기 = " + v.size());// 중복허용 , 순서대로 나옴 11
		System.out.println("벡터 크기 = " + v.capacity());// 20
		System.out.println();

		// 출력
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();

		// v.remove("5");// 앞에꺼만 지워짐
		v.remove(10);// 뒤에있는거 제거하려면 인덱스 번호로 제거하면 됨
		Iterator<String> it = v.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		Vector<String> v2 = new Vector<String>(5, 2);// 기본용량 5개, 2개씩 증가
	}
}
