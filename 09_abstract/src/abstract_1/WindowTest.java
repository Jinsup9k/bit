package abstract_1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame {

	public WindowTest() {
		setBounds(800, 10, 700, 1200);

		setBackground(Color.GREEN);
		setTitle("¹ÚÁø¼ö");
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("C://Users/bitcamp/desktop/sg.jpg");
		g.drawImage(img, 10, 10, this);
	}

	public static void main(String[] args) {
		new WindowTest();
	}
}
