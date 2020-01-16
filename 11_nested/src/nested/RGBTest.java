package nested;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RGBTest extends JFrame {
	private JButton redB, greenB, blueB;
	private DrCanvas can;

	class DrCanvas extends Canvas {
		public DrCanvas() {
			this.setBackground(new Color(255, 200, 255));
		}
	}

	public RGBTest() {
		redB = new JButton(new ImageIcon("D:\\java_se\\workspace\\11_nested\\src\\nested\\1113.gif"));
		greenB = new JButton("GREEN");
		blueB = new JButton("BLUE");

		can = new DrCanvas();

		JPanel p = new JPanel();

		p.add(redB);
		p.add(greenB);
		p.add(blueB);

		Container c = this.getContentPane();
		c.add("North", p);
		c.add("Center", can);

		setBounds(850, 300, 300, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			private void WindowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		redB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(255, 0, 0));
			}
		});

		greenB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0, 255, 0));
			}
		});

		blueB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				can.setBackground(new Color(0, 0, 255));
			}
		});
	}

	public static void main(String[] args) {
		new RGBTest();
	}

}
