package swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class JButtonEx extends JFrame {
	private Icon icon1 = new ImageIcon("D:\\java_se\\workspace\\14_swing\\image\\111.gif");
	private Icon icon2 = new ImageIcon("D:\\java_se\\workspace\\14_swing\\image\\112.gif");
	private Icon icon3 = new ImageIcon("D:\\java_se\\workspace\\14_swing\\image\\113.gif");
	private Icon icon4 = new ImageIcon("D:\\java_se\\workspace\\14_swing\\image\\114.gif");
	private Icon icon5 = new ImageIcon("D:\\java_se\\workspace\\14_swing\\image\\115.gif");
	private JRadioButton[] jb = new JRadioButton[5];
	private ButtonGroup bg = new ButtonGroup();

	public JButtonEx() {
		super("Test");
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 2));
		setBounds(300, 200, 500, 500);
		for (int i = 0; i < 5; i++) {
			jb[i] = new JRadioButton(i + 1 + "번 기요미", icon1);
			con.add(jb[i]);
			jb[i].setToolTipText(i + 1 + "번 기요미 입니당");
			jb[i].setMnemonic(i + 49);
			jb[i].setRolloverIcon(icon2);
			jb[i].setPressedIcon(icon3);
			jb[i].setSelectedIcon(icon4);
			jb[i].setDisabledSelectedIcon(icon5);
			bg.add(jb[i]);
		}
		// pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		new JButtonEx();
	}
}
