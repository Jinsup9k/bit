package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueTest {

	public static void main(String[] args) {
		String[] item = { "소나타", "렉스톤", "제규어" };
		LinkedList<String> q = new LinkedList<String>();

		for (String n : item) {
			q.offer(n);
		}
		out.println("q의 크기 : " + q.size() + "\n"); // FIFO 먼저 들어오면 먼저 나간다
		String data = "";

		while ((data = q.poll()) != null) {
			out.println(data + "삭제!");
			out.println(q.size() + "\n");
		}
	}
}
