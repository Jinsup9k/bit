package DataStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		File file = new File("data.txt");
		int size = (int) file.length();

		byte[] b = new byte[size];

		bis.read(b, 0, size);

		for (int i = 0; i < size; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println(new String(b));// 2번째 방법
	}
}
