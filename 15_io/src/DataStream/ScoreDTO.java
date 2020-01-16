package DataStream;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ScoreDTO implements Comparable<ScoreDTO>, Serializable {
	private String name;
	private int hak, kor, eng, math, tot;
	private double avg;
	public static final int SUBJECT = 3;

	public ScoreDTO(int hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void calc() {
		tot = kor + eng + math;
		avg = 1.0 * tot / SUBJECT;
	}

	public int getHak() {
		return hak;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

	@Override
	public String toString() {
		calc();
		return String.format("%6s %6s %5d %5d %5d %5d %9.2f", hak, name, kor, eng, math, tot, avg);
	}

	@Override
	public int compareTo(ScoreDTO dto) {
		return tot > dto.tot ? -1 : 1;
	}
}
