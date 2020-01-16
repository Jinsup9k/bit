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
import java.util.List;

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

@SuppressWarnings("all")
public class MsPaint2 extends JFrame {
	private JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	private JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	private JCheckBox fill;
	private JRadioButton line, circle, rect, roundRect, pen;
	private JComboBox combo;
	private JButton draw;
	private DrCanvas2 can;
	private JPanel topPanel, bottomPanel, canPanel;
	private int count;
	private List<ShapeDTO2> list;// ArrayList�� �θ��� List�� ���� �� �ؿ���

	public MsPaint2(String title) {
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
		can = new DrCanvas2(this);
		list = new ArrayList<ShapeDTO2>();

		// �ص���
		line = new JRadioButton("��");
		circle = new JRadioButton("��");
		rect = new JRadioButton("�簢��");
		rect.setSelected(true);
		roundRect = new JRadioButton("�ձٻ簢��");
		pen = new JRadioButton("����");
		String rainbow[] = { "����", "��Ȳ", "���", "�ʷ�", "�Ķ�", "����", "����", "���" };
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
				x1T.setText(e.getX() + "");
				y1T.setText(e.getY() + "");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2T.setText(e.getX() + "");
				y2T.setText(e.getY() + "");
				if (x1T.getText().equals(x2T.getText()) && y1T.getText().equals(y2T.getText()))
					return;
				ShapeDTO2 dto = new ShapeDTO2();
				// ��ǥ�Է�
				dto.setX1(Integer.parseInt(x1T.getText().trim()));
				dto.setY1(Integer.parseInt(y1T.getText().trim()));
				dto.setX2(Integer.parseInt(x2T.getText().trim()));
				dto.setY2(Integer.parseInt(y2T.getText().trim()));
				dto.setZ1(Integer.parseInt(z1T.getText().trim()));
				dto.setZ2(Integer.parseInt(z2T.getText().trim()));

				// ä���
				dto.setFill(fill.isSelected());

				// ����
				if (line.isSelected()) {
					dto.setShape(Figure.LINE);
				} else if (circle.isSelected()) {
					dto.setShape(Figure.CIRCLE);
				} else if (rect.isSelected()) {
					dto.setShape(Figure.RECT);
				} else if (roundRect.isSelected()) {
					dto.setShape(Figure.ROUNDRECT);
				} else if (pen.isSelected()) {
					dto.setShape(Figure.PEN);
				}
				// ��
				dto.setColor(combo.getSelectedIndex());

				list.add(dto);
				System.out.println(list.size());

			}
		});

		can.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x2T.setText(e.getX() + "");
				y2T.setText(e.getY() + "");

				can.repaint();
				// ����
				if (pen.isSelected()) {
					ShapeDTO2 dto = new ShapeDTO2();

					// ��ǥ
					dto.setX1(Integer.parseInt(x1T.getText().trim()));
					dto.setY1(Integer.parseInt(y1T.getText().trim()));
					dto.setX2(Integer.parseInt(x2T.getText().trim()));
					dto.setY2(Integer.parseInt(y2T.getText().trim()));
					dto.setZ1(Integer.parseInt(z1T.getText().trim()));
					dto.setZ2(Integer.parseInt(z2T.getText().trim()));

					// ä���
					dto.setFill(fill.isSelected());

					// ����
					dto.setShape(Figure.PEN);

					// ��
					dto.setColor(combo.getSelectedIndex());
					list.add(dto);

					x1T.setText(x2T.getText());
					y1T.setText(y2T.getText());
				}

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

	public List<ShapeDTO2> getList() {
		return list;
	}

	// main
	public static void main(String[] args) {
		new MsPaint2("���� �׸���2");
	}
}