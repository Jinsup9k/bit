package abstract_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

//
public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y�� MM�� dd�� E����  H:m:ss");
		System.out.println("���� ��¥ : " + simpleDateFormat.format(date));
		System.out.println();

		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19950404071235");// String�� Date���� ��ȯ
		System.out.println("������ : " + birth);
		System.out.println("������ : " + simpleDateFormat.format(birth));
		System.out.println();

		//Calendar cal = new GregorianCalendar();// Sub class �̿��� ����
		Calendar cal = Calendar.getInstance();// �޼ҵ带 �̿��� ����
		
		// int year = cal.get(Calendar.YEAR);
		int year = cal.get(1);//�̰� ������
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);// �� 1 �� 2ȭ 3�� 4�� 5�� 6�� 7

		String dayOfWeek = null;
		switch (week) {
		case 1:
			dayOfWeek = "�Ͽ���";
			break;
		case 2:
			dayOfWeek = "������";
			break;
		case 3:
			dayOfWeek = "ȭ����";
			break;
		case 4:
			dayOfWeek = "������";
			break;
		case 5:
			dayOfWeek = "�����";
			break;
		case 6:
			dayOfWeek = "�ݿ���";
			break;
		case 7:
			dayOfWeek = "�����";
			break;
		}
		System.out.println("���� ��¥ : " + year + "�� " + month + "�� " + day + "�� " + dayOfWeek);
	}
}
