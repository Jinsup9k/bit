package DataStream;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class MenuPane extends JMenuBar implements ActionListener {
	private JMenu fileM, editM, viewM;
	private JMenuItem newM, openM, saveM, exitM, cutM, copyM, pasteM, jinsM;
	@SuppressWarnings("unused")
	private TryNotepad tryNotepad;

	public MenuPane(TryNotepad tryNotepad) {
		this.tryNotepad = tryNotepad;
		fileM = new JMenu("����");
		editM = new JMenu("����");
		viewM = new JMenu("����");

		newM = new JMenuItem("���θ����");
		openM = new JMenuItem("����");
		saveM = new JMenuItem("����");
		exitM = new JMenuItem("������");
		cutM = new JMenuItem("�߶󳻱�");
		cutM.setAccelerator(KeyStroke.getKeyStroke('X', Event.ALT_MASK));
		copyM = new JMenuItem("����");
		copyM.setAccelerator(KeyStroke.getKeyStroke('C', Event.ALT_MASK));
		pasteM = new JMenuItem("�ٿ��ֱ�");
		pasteM.setAccelerator(KeyStroke.getKeyStroke('V', Event.ALT_MASK));
		jinsM = new JMenuItem("�������� �������");

		fileM.add(newM);
		fileM.add(openM);
		fileM.add(saveM);
		fileM.add(exitM);
		editM.add(cutM);
		editM.add(copyM);
		editM.add(pasteM);
		viewM.add(jinsM);

		add(fileM);
		add(editM);
		add(viewM);

		// ����Ű ����Ⱑ ����~ c v x

	}

	public JMenuItem getNewM() {
		return newM;
	}

	public JMenuItem getExitM() {
		return exitM;
	}

	public JMenuItem getOpenM() {
		return openM;
	}

	public JMenuItem getSaveM() {
		return saveM;
	}

	public JMenuItem getCutM() {
		return cutM;
	}

	public JMenuItem getCopyM() {
		return copyM;
	}

	public JMenuItem getPasteM() {
		return pasteM;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}