package practice0106;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Practice3 extends JFrame implements ActionListener {
	private JPanel p1, p2, p3, p4;
	private JLabel dispL, inputL;
	private JButton[] button;
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();

	public static void main(String[] args) {
		new Practice3();
	}

	public Practice3() {
		String btn[] = { "←", "C", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+" };
		// 생성
		setLayout(null);
		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		sb2.append("0");
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
		add(p1);
		add(p2);
		add(p3);
		add(p4);

		p1.add(dispL);
		p2.add(inputL);
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.WHITE);
		p1.setBounds(10, 20, 300, 30);
		p2.setBounds(10, 60, 300, 30);
		p3.setBounds(10, 100, 300, 40);
		p4.setBounds(10, 140, 300, 200);

		// 프레임
		setBackground(Color.LIGHT_GRAY);
		setBounds(700, 300, 330, 380);
		setResizable(false);
		setVisible(true);

		// 이벤트
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // 종료

		for (int i = 0; i < button.length; i++) {
			button[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("C")) {
			dispL.setText("");
			inputL.setText("0");
			sb1.delete(0, sb1.length());
			sb2.delete(0, sb2.length());
			sb2.append("0");
			if (sb2.length() <= 1 && command.equals("0")) {
				inputL.setText("0");
				sb2.delete(0, sb2.length());
				return;
			}
		} else if (command.equals("←")) {
			sb1.delete(sb1.length() - 1, sb1.length());
			sb2.delete(sb2.length() - 1, sb2.length());
			if (sb2.length() == 0) {
				sb2.append("0");
				inputL.setText(sb2.toString());
			}
			inputL.setText(sb2.toString());
		} else if (command.equals("0")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb2.append(command);
			inputL.setText(sb2.toString());
		} else if (command.equals("1") || command.equals("2") || command.equals("3") || command.equals("4")
				|| command.equals("5") || command.equals("6") || command.equals("7") || command.equals("8")
				|| command.equals("9")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			sb2.append(command);
			inputL.setText(sb2.toString());
		} else if (command.equals("/")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
			sb2.append("0");
		} else if (command.equals("*")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
			sb2.append("0");
		} else if (command.equals("-")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
			sb2.append("0");
		} else if (command.equals("+")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
			sb2.append("0");
		} else if (command.equals(".")) {
			if (sb2.length() == 1 && sb2.toString().equals("0")) {
				sb2.delete(0, sb2.length());
			}
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
		} else if (command.equals("=")) {
			sb1.append(command);
			dispL.setText(sb1.toString());
			inputL.setText(sb2.toString());
			sb2.delete(0, sb2.length());
		}

	}
}