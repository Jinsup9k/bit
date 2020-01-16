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
public class Practice4 extends JFrame implements ActionListener {
	private JPanel p1, p2, p3, p4;
	private JLabel dispL, inputL;
	private JButton[] button;
	private double result = 0;
	private String op = "0";
	StringBuffer dispB = new StringBuffer();
	StringBuffer inputB = new StringBuffer();

	public static void main(String[] args) {
		new Practice4();
	}

	public Practice4() {
		// 생성
		setLayout(null);
		dispL = new JLabel("", JLabel.RIGHT);
		inputL = new JLabel("0", JLabel.RIGHT);
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		String btn[] = { "←", "C", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+" };
		inputB.append("0");

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
		dispL.setFont(dispL.getFont().deriveFont(20.0f));
		inputL.setFont(inputL.getFont().deriveFont(20.0f));

		// 프레임
		setBackground(Color.LIGHT_GRAY);
		setBounds(700, 300, 330, 380);
		setResizable(false);
		setVisible(true);

		// 이벤트
		addWindowListener(new WindowAdapter() {// 종료
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		for (int i = 0; i < button.length; i++) {// 버튼 추가
			button[i].addActionListener(this);
			button[i].setFont(button[i].getFont().deriveFont(18.0f));
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String pushButton = e.getActionCommand();
		// 숫자
		if (pushButton == "0" || pushButton == "1" || pushButton == "2" || pushButton == "3" || pushButton == "4"
				|| pushButton == "5" || pushButton == "6" || pushButton == "7" || pushButton == "8"
				|| pushButton == "9") {
			if (inputB.toString().equals("0")) {
				inputB.delete(0, 1);
			}
			inputB.append(pushButton);
			inputL.setText(inputB + "");
			dispB.append(pushButton);
		} else if (pushButton == "←") {
			inputB.delete(inputB.length() - 1, inputB.length());
			if (inputB.length() == 0) {
				inputB.append("0");
			}
			inputL.setText(inputB + "");
		} else if (pushButton == "C") {
			dispB.delete(0, dispB.length());
			inputB.delete(0, inputB.length());
			dispB.append("");
			inputB.append("0");
			dispL.setText("");
			inputL.setText("0");
			result = 0;
		} else if (pushButton == ".") {
			if (inputB.indexOf(".") == -1) {
				inputB.append(pushButton);
			}
			inputL.setText(inputB + "");
		} else if (pushButton == "+") {
			if (op.toString() == "0") {
				op = pushButton;
				result = Double.parseDouble(inputB.toString());
				dispB.append(op + "");
				dispL.setText(dispB + "");
				inputL.setText(inputB + "");

			} else if (op.toString() != "0") {
				result = result + Double.parseDouble(inputB.toString());
				op = pushButton;
				dispB.append(op + "");
				dispL.setText(dispB + "");
				inputL.setText(result + "");
			}

			op ="0";
			inputB.delete(0, inputB.length());
			inputB.append("0");

		} else if (pushButton == "-") {
			if (op.toString() == "0") {
				result = Double.parseDouble(inputB.toString());
				op = pushButton;
				inputL.setText(inputB + "");
				
			} else if (op.toString() != "0") {
				result = result - Double.parseDouble(inputB.toString());
				op = pushButton;
				inputL.setText(result + "");
			}

			dispB.append(op + "");
			dispL.setText(dispB + "");
			inputB.delete(0, inputB.length());
			inputB.append("0");
		} else if (pushButton == "/") {
			dispB.append(pushButton);
			dispL.setText(dispB + "");
			inputB.delete(0, inputB.length());

		} else if (pushButton == "*") {
			dispB.append(pushButton);
			dispL.setText(dispB + "");
			inputB.delete(0, inputB.length());

		} else if (pushButton == "+") {
			dispB.append(pushButton);
			dispL.setText(dispB + "");
			inputB.delete(0, inputB.length());
		}
	}
}
// dispB.append(inputB.toString() + "" + pushButton + "");
//dispL.setText(dispB + "");
//inputB.delete(0, inputB.length());
//inputB.append("0");
