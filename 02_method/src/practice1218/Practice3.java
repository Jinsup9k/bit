package practice1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Practice3 p3 = new Practice3();

		// �ʸ� �Է� �޴´�.
		System.out.print("�ʸ� �Է��Ͻÿ� : ");
		int secondCheck = Integer.parseInt(bf.readLine());

		// �ð��� ����Ѵ�.
		String secondResult = p3.time(secondCheck);
		System.out.println(secondResult+ "�Դϴ�.");

	}

	public String time(int secondCheck) {
		
		int min = secondCheck / 60;
		int hour = min / 60;
		int sec = secondCheck % 60;
		min = min % 60;
		
		return (hour +"��"+min+"��"+sec+"��");
		

	}
}
