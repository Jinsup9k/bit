package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable {

	public Clock() {
		setFont(new Font("Consolas", Font.BOLD, 30));
		setForeground(Color.GREEN);
		setBounds(750, 300, 200, 100);
		setVisible(true);

		// �̺�Ʈ
		addWindowListener(new WindowAdapter() {// ����
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ������ ����
		Thread t = new Thread(this);
		t.start();// ����
	}// �⺻ ������

	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

		Date d = new Date();
		g.drawString(sdf.format(d), 35, 60);

	}

	@Override
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Clock();
	}
}