package thread;

import java.awt.Canvas;
//import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

@SuppressWarnings("serial")
public class Racer extends Canvas implements Runnable {
	Image img;
	int pos = 0;
	public static int rank;

	public Racer() {
		// setBackground(new Color((int) (Math.random() * 256), (int) (Math.random() *
		// 256), (int) (Math.random() * 256)));
		img = getToolkit().getImage("D:\\java_se\\workspace\\13_exception_thread\\horse.gif");
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		g.drawImage(img, pos, 0, img.getWidth(this), getHeight(), this);
	}

	@Override
	public void run() {
		for (int i = 0; i < 600; i += (int) (Math.random() * 10 + 1)) {
			pos = i;
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		rank += 1;
		System.out.println(rank + "�� : " + getName());
	}
}
