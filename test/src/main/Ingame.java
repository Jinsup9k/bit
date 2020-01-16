package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ingame extends JFrame implements Runnable, KeyListener {
	Image dong, man, leftMan, rightMan;
	private int x, sel, dx, dy = 0;

	public static void main(String[] args) {
		new Ingame();
	}

	public Ingame() {
		sel = 0;
		dong = getToolkit().getImage("D:\\java_se\\workspace\\test\\Image\\dong.png");
		man = getToolkit().getImage("D:\\java_se\\workspace\\test\\Image\\man.jpg");
		leftMan = getToolkit().getImage("D:\\java_se\\workspace\\test\\Image\\leftMan.jpg");
		rightMan = getToolkit().getImage("D:\\java_se\\workspace\\test\\Image\\rightMan.jpg");

		Thread t = new Thread(this);
		t.start();
		
		setBounds(200, 100, 500, 600);
		setBackground(Color.WHITE);
		setVisible(true);
		Event();

//		dx = (int) (Math.random() * 500) + 10;

	}

	public void Event() {
		// 종료
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		addKeyListener(this);
		// 키보드 이벤트
	}

	@Override

	public void paint(Graphics g) {
		if (sel == 0) {
			g.drawImage(man, x, 480, 100, 120, this);
		} else if (sel == 1) {
			g.drawImage(leftMan, x, 480, 100, 120, this);
		} else if (sel == 2) {
			g.drawImage(rightMan, x, 480, 100, 120, this);
		}
		g.drawImage(dong, dx, dy, 50, 50, this);
	}

	@Override
	public void run() {
		while (true) {
			dy += 10;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (dy == 600) {
				dx = (int) (Math.random() * 500) + 10;
				dy = 0;
			}
			repaint();
		}
	}

//keyListener
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (x > -20) {
				sel = 1;
				x -= 10;
				repaint();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (x < 420) {
				sel = 2;
				x += 10;
				repaint();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
