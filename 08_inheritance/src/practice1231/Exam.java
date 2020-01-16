package practice1231;

public class Exam {
	private String name, dap;
	private char[] ox = new char[5];
	private int score;
	private final String JUNG = "11111";

	public Exam() {

	}

	public Exam(String name, String dap) {
		this.name = name;
		this.dap = dap;
	}

	public void compare() {
		for (int i = 0; i < 5; i++) {
			if (dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			} else {
				ox[i] = 'X';
			}
		}

	}

	public String getName() {
		return name;
	}

	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
}
