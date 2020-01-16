package Interface_1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements WindowListener, ActionListener {
	private JLabel idL, pwdL;
	private JTextField idT, pwdT;
	private JButton loginB, cancelB;

	public static void main(String[] args) {
		Login l = new Login();
	}

	public Login() {
		this.setLayout(null);// 레이아웃값 깸
		idL = new JLabel("아이디");
		idT = new JTextField();
		pwdL = new JLabel("비밀번호");
		pwdT = new JPasswordField();
		loginB = new JButton("로그인");
		cancelB = new JButton("취소");

		idL.setBounds(50, 60, 50, 30);
		idT.setBounds(120, 60, 110, 30);
		pwdL.setBounds(50, 90, 60, 30);
		pwdT.setBounds(120, 90, 110, 30);
		loginB.setBounds(50, 150, 90, 30);
		cancelB.setBounds(140, 150, 90, 30);

		Container c = this.getContentPane();
		c.add(idL);
		c.add(idT);
		c.add(pwdL);
		c.add(pwdT);
		c.add(loginB);
		c.add(cancelB);

		setTitle("로그인");
		setBounds(850, 300, 300, 300);
		setVisible(true);

		// 이벤트
		this.addWindowListener(this);// 종료
		loginB.addActionListener(this);
		cancelB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelB) {//e.getActionCommand() == 값 비교 가능
			idT.setText("");
			pwdT.setText("");
		} else if (e.getSource() == loginB) {
			new LoginResult(idT.getText(), pwdT.getText());
		}
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

}
