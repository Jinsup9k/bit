package DataStream;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ScoreForm extends JFrame implements ActionListener, Score {
	private JLabel hakL, nameL, korL, engL, mathL;
	private JTextField hakT, nameT, korT, engT, mathT;
	private JButton inputB, printB, searchB, descB, saveB, loadB;
	private JScrollPane scroll;
	private JPanel p1, p2, p3, p4, p5, sideP, topP, btnP;
	private JTextArea area;
	private ScoreDTO dto;
	private ArrayList<ScoreDTO> list = new ArrayList<ScoreDTO>();
	private Score score;

	public ScoreForm() {
		hakL = new JLabel("학번");
		nameL = new JLabel("이름");
		korL = new JLabel("국어");
		engL = new JLabel("영어");
		mathL = new JLabel("수학");

		hakT = new JTextField(30);
		nameT = new JTextField(30);
		korT = new JTextField(30);
		engT = new JTextField(30);
		mathT = new JTextField(30);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();

		p1.add("West", hakL);
		p1.add("East", hakT);
		p2.add(nameL);
		p2.add(nameT);
		p3.add(korL);
		p3.add(korT);
		p4.add(engL);
		p4.add(engT);
		p5.add(mathL);
		p5.add(mathT);

		sideP = new JPanel(new GridLayout(6, 1, 11, 30));
		sideP.add(p1);
		sideP.add(p2);
		sideP.add(p3);
		sideP.add(p4);
		sideP.add(p5);

		area = new JTextArea();
		scroll = new JScrollPane(area);

		inputB = new JButton("입력");
		printB = new JButton("출력");
		searchB = new JButton("학번검색");
		descB = new JButton("순위");
		saveB = new JButton("파일저장");
		loadB = new JButton("파일열기");

		topP = new JPanel(new GridLayout(1, 2, 3, 3));
		topP.add(sideP);
		topP.add(scroll);

		btnP = new JPanel(new GridLayout(1, 6, 5, 5));
		btnP.add(inputB);
		btnP.add(printB);
		btnP.add(searchB);
		btnP.add(descB);
		btnP.add(saveB);
		btnP.add(loadB);

		score = new ScoreImpl();

		setBounds(200, 300, 800, 400);
		setVisible(true);

		Container c = getContentPane();
		c.add(topP);
		c.add("South", btnP);
		event();
	}

	public void event() {
		inputB.addActionListener(this);
		printB.addActionListener(this);
		searchB.addActionListener(this);
		descB.addActionListener(this);
		saveB.addActionListener(this);
		loadB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == inputB.getActionCommand()) {
			input(dto);
		} else if (e.getActionCommand() == printB.getActionCommand()) {
			area.append("학번   이름  국  영   수   총점   평균\n");
			print(area);
		} else if (e.getActionCommand() == searchB.getActionCommand()) {
			search(area);
		} else if (e.getActionCommand() == descB.getActionCommand()) {
			tot_desc();
			print(area);
		} else if (e.getActionCommand() == saveB.getActionCommand()) {
			save();
		} else if (e.getActionCommand() == loadB.getActionCommand()) {
			load();
			area.append("학번   이름  국  영   수   총점   평균\n");
			print(area);
		}
	}

	@Override
	public void input(ScoreDTO dto) {
		int hak = Integer.parseInt(hakT.getText());
		String name = nameT.getText();
		int kor = Integer.parseInt(korT.getText());
		int eng = Integer.parseInt(engT.getText());
		int math = Integer.parseInt(mathT.getText());

		dto = new ScoreDTO(hak, name, kor, eng, math);
		list.add(dto);
		JOptionPane.showMessageDialog(this, "입력 완료");
	}

	@Override
	public void print(JTextArea output) {
		for (ScoreDTO dto : list) {
			area.append(dto + "\n");
		}
	}

	@Override
	public void search(JTextArea output) {
		int hak = Integer.parseInt(JOptionPane.showInputDialog("찾을 학번을 입력하세요"));
		int count = 0;

		area.append("학번   이름  국  영   수   총점   평균\n");

		for (ScoreDTO dto : list) {
			if (dto.getHak() == hak) {
				area.append(dto + "\n");
				count++;
			}
		}
		if (count == 0) {
			JOptionPane.showMessageDialog(this, "찾는 학번이 없습니다.");
		}
	}

	@Override
	public void tot_desc() {
		area.append("학번   이름  국  영   수   총점   평균\n");
		Collections.sort(list);
	}

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		File file = null;

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
			JOptionPane.showMessageDialog(this, file + "이 저장되었습니다.");
		}
		if (file == null)
			return;

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			for (ScoreDTO dto : list) {
				oos.writeObject(dto);
			}

			oos.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		File file = null;

		if (result == JFileChooser.APPROVE_OPTION) {// 위와 같다
			file = chooser.getSelectedFile();
		}

		if (file == null)
			return;

		list.clear();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			while (true) {
				try {
					ScoreDTO dto = (ScoreDTO) ois.readObject();
					list.add(dto);
				} catch (Exception e) {
					break;
				}
			}
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ScoreForm();
	}
}
