package swing;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

@SuppressWarnings("all")
public class JListEx extends JFrame {

	public JListEx() {
		super("JList Test");
		setLayout(new FlowLayout());
		String[] listData = { "ȫ", "��", "��", "JAVA", "JSP" };
		JList<String> list1 = new JList<String>(listData);
		list1.setSelectedIndex(0);

		// JList list2 = new JList(new DefaultListModel());
		// DefaultListModel model = (DefaultListModel) list2.getModel();

		DefaultListModel<String> model = new DefaultListModel<String>();
		JList<String> list2 = new JList<String>(model);
		model.addElement("���");
		model.addElement("����");
		model.addElement("����");
		model.addElement("��");
		list2.setSelectedIndex(0);

		Vector<String> vListData = new Vector<String>();
		JList<String> list3 = new JList<String>(vListData);
		JScrollPane scroll = new JScrollPane(list3);
		vListData.add("�౸");
		vListData.add("��");
		vListData.add("�߱�");
		vListData.add("����");
		vListData.add("����");
		vListData.add("�汸");
		vListData.add("�汸");
		vListData.add("����");
		vListData.add("�Ʊ�");

		class Student {
			String id;
			String name;
			String department;

			public Student(String id, String name, String department) {
				this.id = id;
				this.name = name;
				this.department = department;
			}

			public String toString() {
				return name;

			}
		}

		JList<Student> list4 = new JList<Student>(new DefaultListModel<Student>());
		list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		DefaultListModel<Student> model2 = (DefaultListModel<Student>) list4.getModel();
		model2.addElement(new Student("100", "ȫ�浿", "�����"));
		model2.addElement(new Student("200", "�տ���", "�����"));
		model2.addElement(new Student("300", "�����", "����"));
		model2.addElement(new Student("400", "���Ȱ�", "�濵��"));
		list4.setSelectedIndex(0);

		add(list1);
		add(list2);
		add(scroll);
		add(list4);
		setBounds(300, 200, 300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JListEx();
	}
}