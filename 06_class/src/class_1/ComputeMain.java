package class_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeMain {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Compute[] c = new Compute[3];

		 // 입력
		for (int i = 0; i < c.length; i++) {
			c[i] = new Compute();
			System.out.print("x 입력 : ");
			c[i].setX(Integer.parseInt(br.readLine()));
			System.out.print("y 입력 : ");
			c[i].setY(Integer.parseInt(br.readLine()));
			System.out.println();
		}
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		 // 출력
		for (Compute data : c) {
			data.calc();
			System.out.println(data.getX() 
					+ "\t" + data.getY() 
					+ "\t" + data.getSum() 
					+ "\t" + data.getSub() 
					+ "\t" + data.getMul() 
					+ "\t" + String.format("%.2f", data.getDiv()));
		}

	}
}
