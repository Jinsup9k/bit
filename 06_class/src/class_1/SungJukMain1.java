package class_1;

public class SungJukMain1 {
	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setName("홍길동");
		aa.setKor(90);
		aa.setEng(91);
		aa.setMath(100);
		aa.calc();

		SungJuk bb = new SungJuk();
		bb.setName("코난");
		bb.setKor(80);
		bb.setEng(97);
		bb.setMath(90);
		bb.calc();

		SungJuk cc = new SungJuk();
		cc.setName("또치");
		cc.setKor(70);
		cc.setEng(61);
		cc.setMath(50);
		cc.calc();

		System.out.println(aa.getName() + "\t" + aa.getKor() + "\t" + aa.getEng() + "\t" + aa.getMath() + "\t"
				+ aa.getTot() + "\t" + String.format("%.2f", aa.getAvg()) + "\t" + aa.getGrade());
		System.out.println(bb.getName() + "\t" + bb.getKor() + "\t" + bb.getEng() + "\t" + bb.getMath() + "\t"
				+ bb.getTot() + "\t" + String.format("%.2f", bb.getAvg()) + "\t" + bb.getGrade());
		System.out.println(cc.getName() + "\t" + cc.getKor() + "\t" + cc.getEng() + "\t" + cc.getMath() + "\t"
				+ cc.getTot() + "\t" + String.format("%.2f", cc.getAvg()) + "\t" + cc.getGrade());

	}
}
