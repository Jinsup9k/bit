package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame {
	private JTextArea output;
	private JTextField input;
	private JButton send;
	private JScrollPane scroll;
	private JPanel p1;

	public ChatClient() {
		Container c = getContentPane();

		output = new JTextArea("");
		output.setEditable(false);
		input = new JTextField("");
		send = new JButton("Àü¼Û");

		scroll = new JScrollPane(output);
		scroll.setBounds(10, 10, 260, 240);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.setBounds(10, 260, 260, 90);
		p1.add("Center", input);
		p1.add("East", send);

		c.add("Center", scroll);
		c.add("South", p1);

		setBounds(200, 200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ChatClient();
	}
}
