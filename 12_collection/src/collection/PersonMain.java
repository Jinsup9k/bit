package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonMain {

	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("코난", 12);
		PersonDTO cc = new PersonDTO("또치", 34);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);

		return list;

	}

	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		ArrayList<PersonDTO> list = pm.init();
		
		for (PersonDTO dto : list) {
			System.out.println(dto);
		}
		System.out.println("-------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("이름 = " + list.get(i).getName() + " 나이 = " + list.get(i).getAge());
		}
		System.out.println("-------------------");
		
		Iterator<PersonDTO> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
