package class_1;

public class SungJukMain2 {
	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();

		ar[0].setName("ȫ�浿");
		ar[0].setKor(90);
		ar[0].setEng(91);
		ar[0].setMath(100);

		ar[1].setName("��ġ");
		ar[1].setKor(85);
		ar[1].setEng(78);
		ar[1].setMath(82);

		ar[2].setName("�ڳ�");
		ar[2].setKor(65);
		ar[2].setEng(55);
		ar[2].setMath(55);

		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");

		for (SungJuk data : ar) {
			data.calc();
			System.out.println(data.getName() + "\t" + data.getKor() + "\t" + data.getEng() + "\t" + data.getMath()
					+ "\t" + data.getTot() + "\t" + String.format("%.2f", data.getAvg()) + "\t" + data.getGrade());
		}
	}
}
