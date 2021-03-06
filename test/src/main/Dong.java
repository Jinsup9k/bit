package main;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Dong extends JFrame {
	private JButton startB;
	private Image dongMain;

	public Dong() {
		setLayout(null);
		dongMain = getToolkit().getImage("D:\\java_se\\workspace\\test\\Image\\dongMain.png");
		startB = new JButton("시작하기");

		startB.setBounds(185, 310, 110, 40);

		Container c = getContentPane();
		c.add(startB);

		Event();
		setBounds(200, 100, 500, 600);
		setVisible(true);
	}

	public void Event() {
		// 종료
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ESC 종료
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
					System.exit(0);
				}
			}
		});
		// startB
		startB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Game();
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(dongMain, 160, 100, 200, 120, this);
	}
}
