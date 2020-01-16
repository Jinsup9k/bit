package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = { "orange", "apple", "banana", "pear", "peach", "applemango" };

		System.out.print("���� �� = ");
		for (String data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();

		Arrays.parallelSort(ar);
		System.out.print("���� gn = ");

		for (String data : ar) {
			System.out.print(data + " ");

		}
		System.out.println("------------------");
		PersonDTO aa = new PersonDTO("ȫ�浿", 25);
		PersonDTO bb = new PersonDTO("�ڳ�", 12);
		PersonDTO cc = new PersonDTO("��ġ", 34);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();

		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println(list);
		System.out.println("���� �� = " + list);
		Collections.sort(list);
		System.out.println("���� �� = " + list);
		System.out.println();

		//���ı����� �̸����� ���Ӱ� ����
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
				// ��������

				// return dto1.getName().compareTo(dto2.getName());

				// ��������

				return dto1.getName().compareTo(dto2.getName()) * -1;
			}
		};
		System.out.println("\n �̸����� ���Ӱ� ����");
		Collections.sort(list,com);
		System.out.println(list);
	}
}
