package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import controller.librarycontroller;


public class libraryGUI {
	private JFrame frame;
	private JPanel panel;
	private JButton librarianlogin;
	private JButton memberlogin;

	public libraryGUI() {

	}

	public JFrame getFrame() {
		if (frame == null) {
			frame = new JFrame("Main Page");
			frame.setSize(400, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}
		return frame;
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
		}
		return panel;
	}

	public JButton getLibrarianlogin() {
		if (librarianlogin == null) {
			librarianlogin = new JButton("librarian login");
			librarianlogin.setBounds(50, 150, 120, 40);
		}
		return librarianlogin;
	}

	public JButton getMemberlogin() {
		if (memberlogin == null) {
			memberlogin = new JButton("member login");
			memberlogin.setBounds(230, 150, 120, 40);
		}
		return memberlogin;
	}

	

	public void addButtonListener(ActionListener listener) {
		librarianlogin.addActionListener(listener);
	}

	
	public void addmButtonListener(ActionListener listener) {
		memberlogin.addActionListener(listener);
	}

	
	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getLibrarianlogin());
		getPanel().add(getMemberlogin());
		//library guı oluştuğunda controller sınıfı otomatik olarak çalışmalı
		librarycontroller controller = new librarycontroller(this); 

	}

}
	

