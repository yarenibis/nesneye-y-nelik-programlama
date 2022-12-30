package GUI;

import java.awt.Desktop.Action;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.memberLogincontroller;
import controller.memberMenucontroller;

public class memberMenuGUI {
	private JFrame frame;
	private JPanel panel;
	private JButton searchbtn;
	private JLabel sname, sıd, issued_books;
	private JLabel fname, fıd, fissued_books;
	

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

	public JButton getSearchbtn() {
		if(searchbtn==null) {
		searchbtn = new JButton("Search book");
		searchbtn.setBounds(100, 350, 150, 30);
		}
		return searchbtn;
	}

	public JLabel getSname() {
		if (sname == null) {
			sname = new JLabel("Student Name: ");
			sname.setBounds(50, 60, 200, 30);
		}
		return sname;
	}

	public JLabel getSıd() {
		if (sıd == null) {
			sıd = new JLabel("Student ID: ");
			sıd.setBounds(50, 130, 200, 30);
		}
		return sıd;
	}

	public JLabel getIssued_books() {
		if (issued_books == null) {
			issued_books = new JLabel("issued books: ");
			issued_books.setBounds(50, 200, 200, 30);
		}
		return issued_books;
	}

	public JLabel getFname() {
		if (fname == null) {
			fname = new JLabel();
			fname.setBounds(250, 60, 200, 30);
		}
		return fname;
	}

	public JLabel getFıd() {
		if (fıd == null) {
			fıd = new JLabel();
			fıd.setBounds(250, 130, 200, 30);
		}
		return fıd;
	}

	public JLabel getFissued_books() {
		if (fissued_books == null) {
			fissued_books = new JLabel();
			fissued_books.setBounds(250, 200, 200, 30);
		}
		return fissued_books;
	}

	public void addsearchbtnListener(ActionListener listener) {
		searchbtn.addActionListener(listener);
	}

	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getSearchbtn());
		getPanel().add(getFissued_books());
		getPanel().add(getIssued_books());
		getPanel().add(getFname());
		getPanel().add(getSname());
		getPanel().add(getFıd());
		getPanel().add(getSıd());
		memberMenucontroller control = new memberMenucontroller(this);
		getFrame().setVisible(true);

	}

}
