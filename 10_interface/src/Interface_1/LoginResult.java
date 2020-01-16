package Interface_1;

import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginResult extends JFrame implements WindowListener {
	public static final String ID = "angel", PW = "1004";
	JLabel succese, fail;
	String id, pw;

	public LoginResult(String id, String pw) {
		this.id = id;
		this.pw = pw;

		Container c = this.getContentPane();
		if (ID.equals(id) && PW.equals(pw)) {
//			succese = new JLabel("               성공");
//			c.add(succese);
			JOptionPane.showMessageDialog(this, "로그인 성공");
		} else {
			// fail = new JLabel(" 실패");
			// c.add(fail);
			JOptionPane.showMessageDialog(this, "로그인 실패");
		}
		// setBounds(940, 400, 100, 100);
		// setVisible(true);
		// this.addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		setVisible(false);
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
