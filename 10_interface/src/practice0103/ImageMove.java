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
		Panel p = new Panel(); // 패널 선언
		newB = new Button("초기화");// 버튼 5개 만들기~
		leftB = new Button("왼쪽");
		upB = new Button("위");
		downB = new Button("아래");
		rightB = new Button("오른쪽");

		p.setLayout(new GridLayout(1, 5, 3, 0)); // 새로운 레이아웃 적용 - 패널위의 버튼이 정렬함
		p.add(newB); // 버튼추가
		p.add(leftB);
		p.add(upB);
		p.add(downB);
		p.add(rightB);
		add("North", p);// 패널위에 버튼 추가

		setTitle("이미지 이동");
		setBounds(850, 300, FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);

		this.addWindowListener(this);// 끝내기
		newB.addActionListener(this);// 그림 움직이기
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
