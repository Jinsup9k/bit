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
		String[] listData = { "홍", "길", "동", "JAVA", "JSP" };
		JList<String> list1 = new JList<String>(listData);
		list1.setSelectedIndex(0);

		// JList list2 = new JList(new DefaultListModel());
		// DefaultListModel model = (DefaultListModel) list2.getModel();

		DefaultListModel<String> model = new DefaultListModel<String>();
		JList<String> list2 = new JList<String>(model);
		model.addElement("사과");
		model.addElement("딸기");
		model.addElement("포도");
		model.addElement("배");
		list2.setSelectedIndex(0);

		Vector<String> vListData = new Vector<String>();
		JList<String> list3 = new JList<String>(vListData);
		JScrollPane scroll = new JScrollPane(list3);
		vListData.add("축구");
		vListData.add("농구");
		vListData.add("야구");
		vListData.add("구구");
		vListData.add("에구");
		vListData.add("방구");
		vListData.add("길구");
		vListData.add("봉구");
		vListData.add("아구");

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
		model2.addElement(new Student("100", "홍길동", "전산과"));
		model2.addElement(new Student("200", "손오공", "건축과"));
		model2.addElement(new Student("300", "사오정", "토목과"));
		model2.addElement(new Student("400", "저팔계", "경영학"));
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
