package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");// Value 중복 허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");// key 중복 허용 덮어 쓴다.

		// System.out.println(map.get("book101"));

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("코드 입력 : ");
		String code = scan.next();

//		if (map.get(code) == null)
//			System.out.println("없는 Key 입니다.");
//		else
//			System.out.println(map.get(code));

		if (map.containsKey(code))
			System.out.println("없는 Key 입니다.");
		else
			System.out.println(map.get(code));

	}
}
