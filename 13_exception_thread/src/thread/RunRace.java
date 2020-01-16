package thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

@SuppressWarnings("serial")
public class RunRace extends Frame implements ActionListener {
	private int count;
	@SuppressWarnings("unused")
	private String[] name;
	Button btn;
	Panel p1, p2, p3, p4, p5;
	Racer[] racer;

	public RunRace() {
	}

	@SuppressWarnings("static-access")
	public RunRace(int count, String[] name) {
		this.count = count;
		this.name = name;
		btn = new Button(" 출발 ");
		p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p2 = new Panel(new GridLayout(count, 1));

		racer = new Racer[count];
		for (int i = 0; i < count; i++) {
			racer[i] = new Racer();
			racer[i].setName(name[i]);
			p2.add(racer[i]);
		}

		p1.add(btn);
		p1.setBackground(getBackground().LIGHT_GRAY);
		add("South", p1);
		add("Center", p2);

		setBounds(300, 300, 600, 500);
		setVisible(true);
		setResizable(false);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);// 버튼 또 못누르게 만듬

		Thread[] thread = new Thread[count];
		for (int i = 0; i < count; i++) {
			thread[i] = new Thread(racer[i]);
			thread[i].setPriority((int) (Math.random() * 10 + 1));// 1~10
			thread[i].start();
		}

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.print("경주마 수를 입력 : ");
		int count = scan.nextInt();

		String[] name = new String[count];
		for (int i = 0; i < count; i++) {
			System.out.print("경주마 이름 입력 : ");
			name[i] = scan.next();
		}

		new RunRace(count, name);
		new RunRace();

	}
}
