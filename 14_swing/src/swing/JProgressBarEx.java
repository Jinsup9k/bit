package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

@SuppressWarnings("all")
public class JProgressBarEx extends JFrame implements Runnable, ActionListener {
	private JProgressBar jpb = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
	private JButton start = new JButton("start");
	private JButton stop = new JButton("stop");

	public JProgressBarEx() {
		setBounds(300, 200, 400, 300);
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", new JLabel("ProgressBar"));
		con.add("Center", jpb);
		jpb.setStringPainted(true);
		jpb.setString("0%");
		JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp.add(start);
		jp.add(stop);

		start.addActionListener(this);
		stop.addActionListener(this);

		con.add("South", jp);
		setSize(400, 150);
		setVisible(true);

	}

	private boolean bb = true;
	private static int per;

	@Override
	public void run() {
		if (per == 100) {
			per = 0;
		}
		for (int i = per; i <= 100; i++) {
			if (!bb)
				break;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			jpb.setValue(i);
			per = i;
			jpb.setString(per + "%");
		}

		start.setEnabled(true);
		stop.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			bb = true;
			new Thread(this).start();
			start.setEnabled(false);
			stop.setEnabled(true);
		} else if (e.getSource() == stop) {
			bb = false;
			start.setEnabled(true);
			stop.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		new JProgressBarEx();
	}
}
