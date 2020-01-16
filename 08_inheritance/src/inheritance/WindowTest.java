package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {

		// setTitle(title);타이틀 부여

		super("내가 만든 윈도우"); // 부모생성자 호출

		setForeground(Color.orange);
		// setBackground(Color.GREEN);

		setBackground(new Color(0, 128, 0));

		// this.setSize(300,400);

		setBounds(800, 300, 300, 400);

		setVisible(true);// 보여줄때
	}

	@Override
	public void paint(Graphics g) {// Call Back 콜백 메소드(일정 시점이 되면 JVM 에 의해서 호출된다)
		//선
		g.drawLine(150, 200, 0, 0);
		g.drawLine(150, 200, 300, 0);
		// 사각형
		g.drawRect(75, 100, 150, 150);
		// 원
		g.drawOval(75, 100, 150, 150);
	}

	public static void main(String[] args) {
		new WindowTest();

	}
}
