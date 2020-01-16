package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = { "orange", "apple", "banana", "pear", "peach", "applemango" };

		System.out.print("정렬 전 = ");
		for (String data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();

		Arrays.parallelSort(ar);
		System.out.print("정렬 gn = ");

		for (String data : ar) {
			System.out.print(data + " ");

		}
		System.out.println("------------------");
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("코난", 12);
		PersonDTO cc = new PersonDTO("또치", 34);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();

		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println(list);
		System.out.println("정렬 전 = " + list);
		Collections.sort(list);
		System.out.println("정렬 후 = " + list);
		System.out.println();

		//정렬기준을 이름으로 새롭게 변경
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
				// 오름차순

				// return dto1.getName().compareTo(dto2.getName());

				// 내림차순

				return dto1.getName().compareTo(dto2.getName()) * -1;
			}
		};
		System.out.println("\n 이름으로 새롭게 변경");
		Collections.sort(list,com);
		System.out.println(list);
	}
}
