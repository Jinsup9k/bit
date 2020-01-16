package exam;

class ComputeExam {
	public static void main(String[] args) {
		int i = 576;
		System.out.println("백의 자리 =" + i / 100 + "\n" + "십의 자리 =" + i % 100 / 10 + "\n" + "일의 자리 =" + i % 100 % 10);
	}
}
