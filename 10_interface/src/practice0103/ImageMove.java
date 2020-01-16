package practice0103;

import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;

public class ImageMove extends Frame implements WindowListener, ActionListener, MouseListener {
	public static final int FRAME_WIDTH = 500, FRAME_HEIGHT = 500;
	private Button newB, leftB, upB, downB, rightB;
	private int x = 200, y = 200;
	private String pic = "C:\\Users\\bitcamp\\Desktop/111.jpg";
	private Image img;

	public static void main(String[] args) {
		ImageMove i = new ImageMove();

		i.init();
	}

	public void init() {
		Panel p = new Panel(); // �г� ����
		newB = new Button("�ʱ�ȭ");// ��ư 5�� �����~
		leftB = new Button("����");
		upB = new Button("��");
		downB = new Button("�Ʒ�");
		rightB = new Button("������");

		p.setLayout(new GridLayout(1, 5, 3, 0)); // ���ο� ���̾ƿ� ���� - �г����� ��ư�� ������
		p.add(newB); // ��ư�߰�
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		add("North", p);// �г����� ��ư �߰�

		setTitle("�̹��� �̵�");
		setBounds(850, 300, FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);

		this.addWindowListener(this);// ������
		newB.addActionListener(this);// �׸� �����̱�
		leftB.addActionListener(this);
		upB.addActionListener(this);
		downB.addActionListener(this);
		rightB.addActionListener(this);

	}

	@Override
	public void paint(Graphics g) {
		img = Toolkit.getDefaultToolkit().getImage(pic);
		g.drawImage(img, x, y, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == newB) {
			x = y = 200;
		}
		if (e.getSource() == leftB) {
			x -= 10;
			if (x == -70)
				x += 550;
		}
		if (e.getSource() == upB) {
			y -= 10;
			if (y == -70)
				y += 500;
		}
		if (e.getSource() == downB) {
			y += 10;
			if (y == 480)
				y -= 500;
		}
		if (e.getSource() == rightB) {
			x += 10;
			if (x == 500)
				x -= 550;
		}
		repaint();
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	// MouseListener
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}
}
