package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {

	public WindowTest() {

		// setTitle(title);Ÿ��Ʋ �ο�

		super("���� ���� ������"); // �θ������ ȣ��

		setForeground(Color.orange);
		// setBackground(Color.GREEN);

		setBackground(new Color(0, 128, 0));

		// this.setSize(300,400);

		setBounds(800, 300, 300, 400);

		setVisible(true);// �����ٶ�
	}

	@Override
	public void paint(Graphics g) {// Call Back �ݹ� �޼ҵ�(���� ������ �Ǹ� JVM �� ���ؼ� ȣ��ȴ�)
		//��
		g.drawLine(150, 200, 0, 0);
		g.drawLine(150, 200, 300, 0);
		// �簢��
		g.drawRect(75, 100, 150, 150);
		// ��
		g.drawOval(75, 100, 150, 150);
	}

	public static void main(String[] args) {
		new WindowTest();

	}
}
