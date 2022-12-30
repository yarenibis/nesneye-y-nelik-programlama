package GUI;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.LibrarianLogincontroller;
import controller.librarycontroller;
import model.LibrarianLoginmodel;

public class LibrarianLoginGUI extends login {

	
	public void create() {
		this.getFrame().setContentPane(getPanel());
		getPanel().setLayout(null);
		getPanel().add(getNameLabel());
		getPanel().add(getPasswordLabel());
		getPanel().add(getNameField());
		getPanel().add(getPasswordField());
		getPanel().add(getLoginbtn());
		LibrarianLogincontroller controller = new LibrarianLogincontroller(this);
		getFrame().setVisible(true);

	}

}






