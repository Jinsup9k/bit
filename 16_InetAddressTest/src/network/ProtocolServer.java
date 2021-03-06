package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	private ServerSocket serverSocket;
	private BufferedReader br;
	private BufferedWriter bw;

	public ProtocolServer() {

		try {
			serverSocket = new ServerSocket(9500);
			System.out.println("서버준비 완료");

			Socket socket = serverSocket.accept();
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다.");
			e.printStackTrace();
		}
		String line;
		while (true) {
			try {
				// 받는쪽
				line = br.readLine();

				// 보내는쪽
				String[] ar = line.split(":");
				if (ar[0].equals(Protocol.ENTER)) {
					bw.write(ar[1] + "님이 입장\n");
					bw.flush();
				} else if (ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1] + "님이 퇴장\n");
					bw.close();
					br.close();
					
					serverSocket.close();
					System.exit(0);
				} else if (ar[0].equals(Protocol.SEND_MESSAGE)) {
					for (int i = 2; i < ar.length; i++) {
						bw.write("[" + ar[1] + "]" + ar[i] + "\n");
						bw.flush();
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new ProtocolServer();
	}
}
