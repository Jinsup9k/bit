package practice0106;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Practice1 {
	private JFrame frame;
	private JPanel p1, p2, p3, p4;
	private JLabel dispL, inputL;
	private JButton[] button;

	public Practice1() {
		String btn[] = { "←", "C", "1", "2", "3", "/", "4", "5", "6", "*", "7", "8", "9", "-", ".", "0", "=", "+" };
		// 생성
		frame = new JFrame();
		frame.setLayout(null);
		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		// 버튼
		button = new JButton[18];
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(btn[i]);
			if (i > 1)
				p4.add(button[i]);
			else
				p3.add(button[i]);
		}
		// 레이아웃
		p1.setLayout(new GridLayout(1, 1, 3, 3));
		p2.setLayout(new GridLayout(1, 1, 3, 3));
		p3.setLayout(new GridLayout(1, 2, 3, 3));
		p4.setLayout(new GridLayout(4, 4, 3, 3));

		// 화면따리
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);

		p1.add(dispL);
		p2.add(inputL);
		p1.setBackground(Color.WHITE);
		p1.setBounds(10, 20, 300, 30);
		p2.setBackground(Color.WHITE);
		p2.setBounds(10, 60, 300, 30);
		p3.setBounds(10, 100, 300, 40);
		p4.setBounds(10, 140, 300, 200);

		// 프레임
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(700, 300, 330, 380);
		frame.setResizable(false);
		frame.setVisible(true);

		// 이벤트
		frame.addWindowListener(new WindowAdapter() {// 끄기
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		button[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispL.setText("");
				inputL.setText("");
			}
		});
	}

	public static void main(String[] args) {
		new Practice1();
	}
}
