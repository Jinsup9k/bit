package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
class JTableModel extends AbstractTableModel {
	Object[][] data = { { "Nari", "����ġ", new Integer(1234), "���� ģ��" }, { "One", "������", new Integer(1111), "������" },
			{ "two", "������", new Integer(2222), "�Ϳ�����" }, { "three", "�ƶ�ġ", new Integer(3333), "���Ƹ� ģ��" } };

	String[] name = { "���̵�", "�̸�", "��й�ȣ", "����" };

	@Override
	public int getColumnCount() {// ���̺��� ���� ��[�ʼ�]
		return name.length;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public Object getValueAt(int r, int c) {
		return data[r][c];
	}

	@Override
	public boolean isCellEditable(int r, int c) {
		return (c != 0) ? true : false;
	}

	@Override
	public String getColumnName(int c) {
		return name[c];
	}

	@Override
	public void setValueAt(Object obj, int r, int c) {
		data[r][c] = obj;
	}

}

@SuppressWarnings("serial")
public class JTableEx extends JFrame {
	JTable table;
	JTableModel model;

	public JTableEx(JTableModel model) {

	}

	public JTableEx() {
		model = new JTableModel();
		table = new JTable(model);
		add(new JScrollPane(table));

		setBounds(200, 200, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new JTableEx();
	}
}