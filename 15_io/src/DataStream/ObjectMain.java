package DataStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, Exception {
//		PersonDTO dto = new PersonDTO("ȫ�浿", 25, 185.3);

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result.txt2"));
//		oos.writeObject(dto);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result.txt2"));
		PersonDTO dto2 = (PersonDTO) ois.readObject();

		System.out.println("�̸� = " + dto2.getName());
		System.out.println("���� = " + dto2.getAge());
		System.out.println("Ű = " + dto2.getHeight());

	}
}
