package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controller.returnbookcontroller;

public class returnbookGUI {
	private JTable table;
	private JFrame frame;
	private JPanel panel;
	private librarianMenuGUI menu;
	private JScrollPane roll;
	private JButton delete;
	private returnbookcontroller rb;

	public JTable getTable() {

		if (table == null) {
			table = new JTable();
			table.setBounds(50, 70, 300, 230);
		}
		return table;
	}

	public JButton getDelete() {
		delete = new JButton("Delete");
		delete.setBounds(160, 330, 120, 45);
		return delete;
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

	public void deleteListener(ActionListener listener) {
		delete.addActionListener(listener);

	}

	public void returnbtnListener(ActionListener listener) {
		menu.returnbtnListener(listener);
	}

	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getTable());
		getPanel().add(getDelete());
		returnbookcontroller returnbook = new returnbookcontroller(this);
		getFrame().setVisible(true);

	}

}
