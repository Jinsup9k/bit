package practice0103;

import java.awt.*;
import java.awt.event.*;

import Interface_1.WindowExit;

public class WindowTestPractice extends Frame implements MouseListener, MouseMotionListener {
	private int x, y;

	public static void main(String[] args) {
		new WindowTestPractice();
	}

	public WindowTestPractice() {
		setTitle("�������� ������");
		setBounds(600, 10, 700, 1000);
		setBackground(Color.GREEN);
		setVisible(true);

		// �̺�Ʈ
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
	}

	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("C://Users/bitcamp/desktop/sg.jpg");
		g.drawImage(img, 10, 10, this);
		
		g.drawString("X : " + x + "\tY :" + y, x, y);
	}

	// Mouse Listener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 CLICK");
		x = e.getX();
		y = e.getY();
//		System.out.println("X : " + e.getX() + "\t Y : " + e.getY());
		
		repaint();// update() - paint()������ ȣ��
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺 IN");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺 OUT");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// MouseMotionListener Override - Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("���콺 �巡��");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
