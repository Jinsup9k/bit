package practice0108;

import java.text.DecimalFormat;

public class SungJukDTO implements Comparable<SungJukDTO> {
	public static final int SUBJECT = 3;
	private int number, kor, eng, math, tot;
	private String name;
	private double avg;

	public SungJukDTO() {
	}

//	public SungJukDTO(int number, String name, int kor, int eng, int math) {
//		this.number = number;
//		this.name = name;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//
//	}

	public void calc() {
		tot = kor + eng + math;
		avg = (tot / SUBJECT) * 1.0;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return number + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t"
				+ new DecimalFormat("#.##").format(avg);
	}

	@Override
	public int compareTo(SungJukDTO dto) {
//		if (tot < dto.tot)
//			return 1;
//		else if (tot == dto.tot)
//			return 0;
//		else if (tot > dto.tot)
//			return -1;

		// return name.compareTo(dto.getName());

		return tot > dto.tot ? -1 : 1;
	}
}
