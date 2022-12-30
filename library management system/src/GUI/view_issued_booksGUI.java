package GUI;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class view_issued_booksGUI {
	private JTable table;
	private JFrame frame;
	private JPanel panel;
	private librarianMenuGUI menu;
	private JScrollPane roll;

	public JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBounds(50, 40, 300, 400);
			Object[]column= {"ısbn","title","author","student id"};
			
		}
		return table;
	}

	public JScrollPane getRoll() {
		if (roll == null) {
			roll = new JScrollPane();
		}
		return roll;
	}

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame();
			frame.setSize(400, 500);
		}
		return frame;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	public void viewbtnListener(ActionListener listener) {
		menu.viewbtnListener(listener);

	}

	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getTable());
		getFrame().setVisible(true);

	}

}
