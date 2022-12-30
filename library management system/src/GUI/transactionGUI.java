package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.searchcontroller;
import controller.transactioncontroller;

public class transactionGUI {
	private JFrame frame;
	private JPanel panel;
	private JLabel transno, bookısbn, studentıd;
	private JTextField ftrans, fısbn, fıd;
	private JButton create;

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame();
			frame.setSize(400, 400);
		}
		return frame;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	public JLabel getTransno() {
		if (transno == null) {
			transno = new JLabel("Trans No :");
			transno.setBounds(60, 60, 100, 30);
		}
		return transno;
	}

	public JLabel getBookısbn() {
		if (bookısbn == null) {
			bookısbn = new JLabel("Book ISBN :");
			bookısbn.setBounds(60, 130, 100, 30);
		}
		return bookısbn;
	}

	public JLabel getStudentıd() {
		if (studentıd == null) {
			studentıd = new JLabel("Student ID :");
			studentıd.setBounds(60, 200, 100, 30);
		}
		return studentıd;
	}

	public JTextField getFtrans() {
		if (ftrans == null) {
			ftrans = new JTextField();
			ftrans.setBounds(180, 60, 100, 30);
		}
		return ftrans;
	}

	public JTextField getFısbn() {
		if (fısbn == null) {
			fısbn = new JTextField();
			fısbn.setBounds(180, 130, 100, 30);
		}
		return fısbn;
	}

	public JTextField getFıd() {
		if (fıd == null) {
			fıd = new JTextField();
			fıd.setBounds(180, 200, 100, 30);
		}
		return fıd;
	}

	public JButton getCreate() {
		if (create == null) {
			create = new JButton("Create");
			create.setBounds(60, 270, 100, 40);
		}
		return create;
	}

	public void createtransListener(ActionListener listener) {
		create.addActionListener(listener);
	}

	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getFtrans());
		getPanel().add(getFısbn());
		getPanel().add(getFıd());
		getPanel().add(getTransno());
		getPanel().add(getBookısbn());
		getPanel().add(getStudentıd());
		getPanel().add(getCreate());
		transactioncontroller trans = new transactioncontroller(this);
		getFrame().setVisible(true);
	}

}
