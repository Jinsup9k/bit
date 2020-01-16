package swingPractice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

//JRadioButton�� �⺻�� �簢�� üũ �ȴ�
//���� ���� �����ϸ� �ڵ����� �簢���� �����ȴ�
//
//Canvas�� �⺻���� ����������� �Ѵ�
//
//x1T, y1T, x2T, y2T �̰����� ��ǥ�� �Է��ϰ� �׸��� ��ư�� ������ ���ϴ� ��������canvas�� �׷�����
//������ JCombobox���� ����- �� �� �� �� ��
//�ձ� �簢���� �𼭸� ���� 50������ �ִ´�

@SuppressWarnings("all")
public class MsPaint extends JFrame {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas can;
	private JPanel topPanel, bottomPanel, canPanel;
	int count;
	ArrayList<ShapeDTO> list = new ArrayList<ShapeDTO>();

	public MsPaint(String title) {
		// ������ �ֱ�
		// ���� ����

		x1L = new JLabel("X1");
		y1L = new JLabel("Y1");
		x2L = new JLabel("X2");
		y2L = new JLabel("Y2");
		z1L = new JLabel("Z1");
		z2L = new JLabel("Z2");

		x1T = new JTextField("0");
		y1T = new JTextField("0");
		x2T = new JTextField("0");
		y2T = new JTextField("0");
		z1T = new JTextField("50");
		z2T = new JTextField("50");

		fill = new JCheckBox("ä���");

		topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(1, 7));
		topPanel.add(x1L);
		topPanel.add(x1T);
		topPanel.add(y1L);
		topPanel.add(y1T);
		topPanel.add(x2L);
		topPanel.add(x2T);
		topPanel.add(y2L);
		topPanel.add(y2T);
		topPanel.add(z1L);
		topPanel.add(z1T);
		topPanel.add(z2L);
		topPanel.add(z2T);
		topPanel.add(fill);

		// �߰�����
		can = new DrCanvas(this);

		// �ص���
		line = new JRadioButton("��");
		circle = new JRadioButton("��");
		rect = new JRadioButton("�簢��");
		rect.setSelected(true);
		roundRect = new JRadioButton("�ձٻ簢��");
		pen = new JRadioButton("����");
		String rainbow[] = { "����", "��Ȳ", "���", "�ʷ�", "�Ķ�", "����", "����" };
		combo = new JComboBox<String>(rainbow);
		draw = new JButton("�׸���");

		ButtonGroup g = new ButtonGroup();
		g.add(line);
		g.add(circle);
		g.add(rect);
		g.add(roundRect);
		g.add(pen);

		bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1, 8));
		bottomPanel.add(line);
		bottomPanel.add(circle);
		bottomPanel.add(rect);
		bottomPanel.add(roundRect);
		bottomPanel.add(pen);
		bottomPanel.add(combo);
		bottomPanel.add(draw);

		// �̺�Ʈ
		draw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				can.repaint();
			}
		});

		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				count++;
				x1T.setText(e.getX() + "");
				y1T.setText(e.getY() + "");
			}
		});

		can.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				if (list.size() > 0 && list.size() > count && !pen.isSelected())
					list.remove(list.size() - 1);
				x2T.setText(e.getX() + "");
				y2T.setText(e.getY() + "");
				can.repaint();
			}
		});

		can.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				x1T.setText(e.getX() + "");
				y1T.setText(e.getY() + "");
			}
		});

		// Frame
		Container con = getContentPane();
		con.add("North", topPanel);
		con.add("Center", can);
		con.add("South", bottomPanel);

		setTitle(title);
		setBounds(300, 200, 900, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setResizable(false);

	}

//getter

	public JTextField getX1T() {
		return x1T;
	}

	public JTextField getY1T() {
		return y1T;
	}

	public JTextField getX2T() {
		return x2T;
	}

	public JTextField getY2T() {
		return y2T;
	}

	public JTextField getZ1T() {
		return z1T;
	}

	public JTextField getZ2T() {
		return z2T;
	}

	public JComboBox getCombo() {
		return combo;
	}

	public JCheckBox getFill() {
		return fill;
	}

	public JRadioButton getLine() {
		return line;
	}

	public JRadioButton getCircle() {
		return circle;
	}

	public JRadioButton getRect() {
		return rect;
	}

	public JRadioButton getRoundRect() {
		return roundRect;
	}

	public JRadioButton getPen() {
		return pen;
	}

	// main
	public static void main(String[] args) {
		new MsPaint("���� �׸���");
	}
}