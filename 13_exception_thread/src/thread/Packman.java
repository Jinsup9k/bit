package thread;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Packman extends Frame implements KeyListener, Runnable {
	private Image img, icon;
	private int sel, x = 225, y = 225, mx, my, score = 0;
	private int[] iconX;
	private int[] iconY;
	Label scoreL;

// main
	public static void main(String[] args) {
		new Packman();

	}

	public Packman() {
		scoreL = new Label("0점");
		iconX = new int[5];
		iconY = new int[5];
		img = getToolkit().getImage("packman.jpg");
		icon = getToolkit().getImage("tangerine.png");

		for (int i = 0; i < 5; i++) {
			iconX[i] = (int) (Math.random() * 460) + 20;
			iconY[i] = (int) (Math.random() * 430) + 50;
		}

		setLayout(null);
		add(scoreL);
		scoreL.setBounds(440, 70, 50, 20);
		scoreL.setFont(new Font("궁서", Font.PLAIN, 17));
		setBounds(300, 200, 500, 500);
		setResizable(false);
		setVisible(true);

		// 종료 이벤트
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(this);
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void paint(Graphics g) {

		for (int i = 0; i < 5; i++) {
			g.drawImage(icon, iconX[i], iconY[i], 20, 20, this);
		}
		g.drawImage(img, x, y, x + 50, y + 50, sel * 50, 0, sel * 50 + 50, 50, this);// 앞에서부터 위치 4개 이미지 위치 4개
	}

// thread
	@Override
	public void run() {

		while (true) {
			if (sel % 2 == 0) {
				sel++;
			} else {
				sel--;
			}

			x += mx;
			y += my;
			if (x > 500) {
				x = 0;
			} else if (x < 0) {
				x = 500;
			} else if (y > 500) {
				y = 0;
			} else if (y < 0) {
				y = 500;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			int sensitivity = 15;
			int x_center = x + 25, y_center = y + 25;
			int bx = x_center + sensitivity, bx2 = x_center - sensitivity, by = y_center + sensitivity,
					by2 = y_center - sensitivity;
			int iconX_center, iconY_center;

			for (int i = 0; i < 5; i++) {
				iconX_center = iconX[i] + 10;
				iconY_center = iconY[i] + 10;
				if (iconX_center <= bx && iconX_center >= bx2 && iconY_center <= by && iconY_center >= by2) {
					iconX[i] = iconY[i] = 0;
					score++;
					scoreL.setText(score * 20 + "점");
				}
			}

			repaint();
		}
	}

// keyListener
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ESCAPE) {// 27번
			System.exit(0);
		} else if (key == KeyEvent.VK_LEFT) {
			sel = 0;
			mx = -15;
			my = 0;
		} else if (key == KeyEvent.VK_RIGHT) {
			sel = 2;
			mx = 15;
			my = 0;
		} else if (key == KeyEvent.VK_UP) {
			sel = 4;
			mx = 0;
			my = -15;
		} else if (key == KeyEvent.VK_DOWN) {
			sel = 6;
			mx = 0;
			my = 15;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
