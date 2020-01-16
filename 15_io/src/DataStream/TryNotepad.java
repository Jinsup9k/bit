package DataStream;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TryNotepad extends JFrame implements ActionListener {
	private JTextArea area;
	private JScrollPane scroll;
	private MenuPane menu;
	private File file = null;

	public TryNotepad() {
		super("간단 메모장");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		area.setFont(new Font("고딕체", Font.BOLD, 17));

		menu = new MenuPane(this);
		this.setJMenuBar(menu);

		Container con = getContentPane();
		con.add("Center", scroll);

		setBounds(300, 300, 600, 500);
		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		event();
	}

	public void event() {
		menu.getNewM().addActionListener(this);
		menu.getOpenM().addActionListener(this);
		menu.getSaveM().addActionListener(this);
		menu.getExitM().addActionListener(this);
		menu.getCutM().addActionListener(this);
		menu.getCopyM().addActionListener(this);
		menu.getPasteM().addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int result = JOptionPane.showConfirmDialog(area, "종료 하시겠습니까?", "메모장", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else if (result == JOptionPane.NO_OPTION) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menu.getNewM()) {
			area.setText("");
		} else if (e.getSource() == menu.getOpenM()) {
			openDialog();// 열기 다이얼로그
			fileRead();// 파일읽기
		} else if (e.getSource() == menu.getSaveM()) {
			saveDialog();
			fileWrite();
		} else if (e.getSource() == menu.getExitM()) {
			int result = JOptionPane.showConfirmDialog(this, "저장 하시겠습니까?", "메모장", JOptionPane.YES_NO_CANCEL_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				// 파일저장
				if (area.getText().length() != 0)
					saveDialog();
				System.exit(0);
			} else if (result == JOptionPane.NO_OPTION) {
				System.exit(0);
			}
		} else if (e.getSource() == menu.getCutM()) {
			area.cut();
		} else if (e.getSource() == menu.getCopyM()) {
			area.copy();
		} else if (e.getSource() == menu.getPasteM()) {
			area.paste();
		}
	}

	private void openDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
//		if (result == 0) {
		if (result == JFileChooser.APPROVE_OPTION) {// 위와 같다
			// 선택한 파일의 경로와 ㅍ ㅏ 일명이 필요
			file = chooser.getSelectedFile();
			// JOptionPane.showMessageDialog(this, file); 파일 경로 확인

		}
	}

	private void fileRead() {
		if (file == null)
			return;
		area.setText("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;

			while ((line = br.readLine()) != null) {
				area.append(line + "\n");
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void saveDialog() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);

		if (result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		JOptionPane.showMessageDialog(this, file);
	}

	private void fileWrite() {
		if (file == null)
			return;

		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			String data = area.getText();
			bw.write(data);
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new TryNotepad();
	}
}
